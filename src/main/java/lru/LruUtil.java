package lru;

import java.util.LinkedList;

/**
 * @author simple_huang@foxmail.com on 2017/9/15.
 *         实现简单的基于整型的Lru算法
 */
public class LruUtil {
    //使用LinkedList实现
    private static LinkedList<Integer> inner = new LinkedList<Integer>();
    //设置LinkedList最大长度为5, 即限定了最大容量
    private static final int maxSize = 5;

    /**
     * 私有化构造器
     */
    private LruUtil() {
    }

    /**
     * 返回被移除的数字本身
     * 如果没有需要移除的, 返回添加的数字本身
     *
     * @param i
     * @return
     */
    public static int LruAdd(int i) {
        //如果存在i, 说明i被重复使用了, 则将i置于first位置, 这里是最小可能被移除的位置
        if (inner.contains(i)) {
            inner.remove(inner.indexOf(i));
            inner.addFirst(i);
            return i;
        }
        //如果长度小于设定最大值, 说明容器还没满, 可以在不移除的情况下添加
        if (inner.size() < maxSize) {
            inner.addFirst(i);
            return i;
        }
        //如果以上两种情况都不存在, 则将last位置元素移除, 将数字i添加到first位置
        int removeInt = inner.removeLast();
        inner.addFirst(i);
        return removeInt;
    }

    public static void main(String[] args) {
        int[] intArray = {9, 7, 2, 1, 0, 1, 7, 0, 6, 1, 9, 4, 6};
        for (int i : intArray) {
            LruUtil.LruAdd(i);
            System.out.println(inner + " " + "添加 " + i);
        }
    }
}
