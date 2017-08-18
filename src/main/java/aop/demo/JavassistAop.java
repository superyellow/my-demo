package aop.demo;

import aop.model.Business;
import javassist.*;

/**
 * @author simple_huang@foxmail.com on 2017/8/18.
 */
public class JavassistAop {
    public static void main(String[] args) {
        try {
            run();
        } catch (NotFoundException e) {
            e.printStackTrace();
        } catch (CannotCompileException e) {
            e.printStackTrace();
        }
    }
    public static void run() throws NotFoundException, CannotCompileException {
        ClassPool classPool = ClassPool.getDefault();
        Loader loader = new Loader();
        loader.addTranslator(classPool, new MyTranslator());
        try {
            loader.run("aop.demo.JavassistAop$MyTranslator", null);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static class MyTranslator implements Translator{

        public void start(ClassPool classPool) throws NotFoundException, CannotCompileException {

        }

        public void onLoad(ClassPool classPool, String s) throws NotFoundException, CannotCompileException {
            if (!"aop.model.Business".equals(s)) {
                return;
            }
            CtClass cc = classPool.get(s);
            CtMethod cm = cc.getDeclaredMethod("doSomeThing");
            cm.insertBefore("{\n" +
                    "            System.out.println(\"doSomeThing前记录日志\");\n" +
                    "        }");

        }

        public static void main(String[] args) {
            Business business = new Business();
            business.doSomeThing();
            business.doSomeThing2();
        }
    }
}
