package aop.demo;


import aop.model.Business;
import aop.model.IBusiness2;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author simple_huang@foxmail.com on 2017/8/18.
 */
public class CglibAop {
    public static void main(String[] args) {
        byteCodeGe();
    }

    public static void byteCodeGe() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Business.class);
        enhancer.setCallback(new LogIntercept());
        IBusiness2 business2 = (IBusiness2) enhancer.create();
        business2.doSomeThing2();
    }

    public static class LogIntercept implements MethodInterceptor {

        public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
            Object rev = methodProxy.invokeSuper(o, objects);
            if (method.getName().equals("doSomeThing2")) {
                System.out.println("记录日志");
            }
            return rev;
        }
    }
}
