package sort;

/**
 * @author simple_huang@foxmail.com on 2017/8/22.
 */
public class BubbleSortUtil {
    /**
     * 从大到小排列int数组
     * 错误写法
     * @param ints
     * @return
     */
    public static int[] bubbleSortInt(int[] ints) {
        int s;
        int step=0;//计步器
        for (int i=0; i<ints.length; i++) {
            for (int j=0; j<ints.length-i-1; j++) {
                System.out.println("i= " + i + " j= " + j);
                if (ints[j] <= ints[j+1]) {
                    s = ints[j];
                    ints[j] = ints[j+1];
                    ints[j+1] = s;
                }
                step++;
                System.out.println("step is " + step);
            }
        }

        //打印
        for (int i:ints) {
            System.out.print(i);
        }
        System.out.println("\n" + step);
        return ints;
    }
    //错误写法
    /*public static int[] bubbleSortInt(int[] ints) {
        int s;
        int step=0;//计步器
        for (int i=0; i<ints.length; i++) {
            for (int j=i; j<ints.length-1; j++) {
                System.out.println("i= " + i + " j= " + j);
                if (ints[j] <= ints[j+1]) {
                    s = ints[j];
                    ints[j] = ints[j+1];
                    ints[j+1] = s;
                }
                step++;
                System.out.println("step is " + step);
            }
        }

        //打印
        for (int i:ints) {
            System.out.print(i);
        }
        System.out.println("\n" + step);
        return ints;
    }*/

    /**
     * 私有化构造器
     */
    private BubbleSortUtil() {}

    public static void main(String[] args) {
        bubbleSortInt(new int[]{1, 6, 2, 3, 4, 7, 5, 4});

    }
}
