package aop.demo2;

import aop.model.Business;
import aop.model.IBusiness;
import aop.model.IBusiness2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author simple_huang@foxmail.com on 2017/10/26.
 */
public class AopPractice {
    public static class LogInvocationHandler implements InvocationHandler{
        public Object target;
        LogInvocationHandler(Object target) {
            this.target = target;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            Object rev = method.invoke(target, args);
            if (method.getName().equals("doSomeThing")) {
                System.out.println("打印日志");
            }
            if (method.getName().equals("doSomeThing2")) {
                System.out.println("打印日志2");
            }
            return rev;
        }

        public static void main(String[] args) {
            Class[] proxyInterfaces = new Class[]{IBusiness.class, IBusiness2.class};
            LogInvocationHandler logHandler = new LogInvocationHandler(new Business());
            ClassLoader classLoader = AopPractice.class.getClassLoader();
            IBusiness2 proxyBusiness2 = (IBusiness2) Proxy.newProxyInstance(classLoader, proxyInterfaces, logHandler);
            proxyBusiness2.doSomeThing2();
            ((IBusiness)proxyBusiness2).doSomeThing();
        }
    }
}
