package aop.demo;

import aop.model.Business;
import aop.model.IBusiness;
import aop.model.IBusiness2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author simple_huang@foxmail.com on 2017/8/15.
 */
public class TestAop {

    public static void main(String[] args) {
        //需要代理的接口, 被代理类实现的多个接口都要在这里定义
        Class[] proxyInterface = new Class[] {IBusiness.class, IBusiness2.class};
        //构建AOP的Advice, 这里需要传入业务类的实例
        LogInvocationHandler handler = new LogInvocationHandler(new Business());
        //生成代理类的字节码加载器
        ClassLoader classLoader = TestAop.class.getClassLoader();
        //织入器, 织入代码并生成代理类
        IBusiness2 proxyBusiness = (IBusiness2)Proxy.newProxyInstance(classLoader, proxyInterface, handler);
        //使用代理类的实例来调用方法
        proxyBusiness.doSomeThing2();
        ((IBusiness)proxyBusiness).doSomeThing();
    }


    public static class LogInvocationHandler implements InvocationHandler{
        public Object target;
        LogInvocationHandler(Object target){
            this.target = target;
        }
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            Object rev = method.invoke(target, args);
            if (method.getName().equals("doSomeThing")) {
                System.out.println("打印日志");
            }
            return rev;
        }
    }
}
