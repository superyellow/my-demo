package lru;

import java.util.LinkedList;

/**
 * @author simple_huang@foxmail.com on 2017/9/15.
 * 实现简单的基于整型的Lru算法
 */
public class LruUtil {
    private static LinkedList<Integer> inner = new LinkedList<Integer>();
    private static final int maxSize = 5;
    /**
     * 私有化构造器
     */
    private LruUtil() {}
    public static int LruRaplace(int i) {
        if (inner.contains(i)) {
            inner.remove(inner.indexOf(i));
            inner.addFirst(i);
            return i;
        }
        if (inner.size() < maxSize) {
            inner.addFirst(i);
            return i;
        } else {
            int removeInt = inner.removeLast();
            inner.addFirst(i);
            return removeInt;
        }
    }

    public static void main(String[] args) {
        int[] intArray = {9, 7, 2, 1, 0, 1, 7, 0, 6, 1, 9, 4, 6};
        for (int i: intArray) {
            LruUtil.LruRaplace(i);
            System.out.println(inner);
        }
    }
}
