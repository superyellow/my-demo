package aop.demo;

import aop.model.Business;
import javassist.*;
import javassist.bytecode.stackmap.TypeData;

import java.io.IOException;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;

/**
 * @author simple_huang@foxmail.com on 2017/8/21.
 */
public class MyClassFileTransformer implements ClassFileTransformer{
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
        System.out.println(className);
        if (!"aop/model/Business".equals(className)) {
            return null;
        }
        if (className != null && className.indexOf("/") != -1) {
            className = className.replace("/", ".");
        }
        try {
            CtClass cc = ClassPool.getDefault().get(className);
            CtMethod method = cc.getDeclaredMethod("doSomeThing");
            method.insertBefore("{ System.out.println(\"doSomeThing前记录日志\"); }");
            return cc.toBytecode();
        } catch (NotFoundException e) {
            e.printStackTrace();
        } catch (CannotCompileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void premain(String options, Instrumentation ins) {
        ins.addTransformer(new MyClassFileTransformer());
    }

}
