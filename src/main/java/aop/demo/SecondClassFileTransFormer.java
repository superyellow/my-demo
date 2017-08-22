package aop.demo;

import javassist.*;
import org.apache.commons.lang.StringUtils;

import java.io.IOException;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;

/**
 * @author simple_huang@foxmail.com on 2017/8/22.
 */
public class SecondClassFileTransFormer implements ClassFileTransformer{
    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
        System.out.println(className);
        if (!"aop/model/business".equals(className)) {
            return null;
        }
        if (StringUtils.isNotBlank(className) && className.contains("/")) {
            className = className.replace("/", ".");
        }
        try {
            CtClass cc = ClassPool.getDefault().get(className);
            CtMethod cm = cc.getDeclaredMethod("doSomeThing");
            cm.insertBefore("{\n" +
                    "        System.out.println(\"...\");\n" +
                    "    }");
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
        ins.addTransformer(new SecondClassFileTransFormer());
    }
}
