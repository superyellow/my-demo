package aop.model;

/**
 * @author simple_huang@foxmail.com on 2017/8/15.
 */
public class Business implements IBusiness, IBusiness2 {

    public boolean doSomeThing() {
        System.out.println("执行bussiness");
        return true;
    }

    public void doSomeThing2() {
        System.out.println("执行bussiness2");
    }
}
