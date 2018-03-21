package singleton;

/**
 * Created by huangchao on 18/3/21.
 */
public class SingletonFactory {
    private static HelloSingleton helloSingleton;
    //使用了延时加载
    //但并不是线程安全的，当线程A进入条件，让出时间片，线程B进入，返回类一个实例，线程A重获时间片，同样再实例化了一遍
    //或者线程B会获得一个未完全初始化的对象
    public static HelloSingleton instanceV1() {
        if (helloSingleton == null) {
            return helloSingleton = new HelloSingleton();
        }
        return helloSingleton;
    }

    //加入同步锁, 但代价太高了
    public static synchronized HelloSingleton instanceV2() {
        if (helloSingleton == null) {
            return helloSingleton = new HelloSingleton();
        }
        return helloSingleton;
    }

    //在静态变量为null的时候才试图获得锁进入判断
    //但因为指令重排序的原因, 线程A在获取锁后创建实例时, 未实例化完成的对象引用是有可能被复制给helloSingleton的
    public static HelloSingleton instanceV3() {
        if (helloSingleton == null) {
            synchronized(SingletonFactory.class) {
                if (helloSingleton == null) {
                    return helloSingleton = new HelloSingleton();
                }
            }
        }
        return helloSingleton;
    }

    //加入volatile关键字, 屏蔽指令重排
    private static volatile HelloSingleton helloSingletonBrother;
    public static HelloSingleton instanceV4() {
        if (helloSingletonBrother == null) {
            synchronized(SingletonFactory.class) {
                if (helloSingletonBrother == null) {
                    return helloSingletonBrother = new HelloSingleton();
                }
            }
        }
        return helloSingletonBrother;
    }

    //使用内部类的方式实现
    public static class innerHolder {
        public static HelloSingleton helloSingleton = new HelloSingleton();
    }
    public static HelloSingleton instanceV5() {
        return innerHolder.helloSingleton;
    }
}
