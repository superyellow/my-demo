package aop.demo;

import aop.model.Business;
import aop.model.IBusiness;
import aop.model.IBusiness2;
import aop.demo.TestAop.LogInvocationHandler;

import java.lang.reflect.Method;

/**
 * @author simple_huang@foxmail.com on 2017/8/18.
 */
public class BusinessProxy implements IBusiness, IBusiness2 {
    private LogInvocationHandler h;
    public BusinessProxy(LogInvocationHandler h){
        this.h = h;
    }

    public void doSomeThing2() {
        try {
            Method m = (h.target).getClass().getMethod("doSomeThing", null);
            h.invoke(this, m, null);
        } catch (NoSuchMethodException e) {

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public boolean doSomeThing() {
        try {
            Method m = (h.target).getClass().getMethod("doSomeThing2", null);
            return (Boolean)h.invoke(this, m, null);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
        staticDynamic();
    }

    public static void staticDynamic() {
        LogInvocationHandler handler = new LogInvocationHandler(new Business());
        new BusinessProxy(handler).doSomeThing();
        new BusinessProxy(handler).doSomeThing2();
    }
}
