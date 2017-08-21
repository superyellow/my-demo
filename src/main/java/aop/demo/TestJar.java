package aop.demo;

import aop.model.Business;

/**
 * @author simple_huang@foxmail.com on 2017/8/21.
 */
public class TestJar {
    public static void main(String[] args) {
        new Business().doSomeThing();
        new Business().doSomeThing2();
    }
}
