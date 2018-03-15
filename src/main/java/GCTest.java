/**
 * @author simple_huang@foxmail.com on 2018/3/5.
 */
public class GCTest {
    public Object instance = null;
    private static final int _1MB = 1024*1024;
    private byte[] bigSize = new byte[_1MB * 2];

    public static void testGC() {
        GCTest t1 = new GCTest();
        GCTest t2 = new GCTest();
        t1.instance = t2;
        t2.instance = t1;

        t1 = null;
        t2 = null;

        System.gc();
    }

    public static void main(String[] args) {
        testGC();
    }
}
