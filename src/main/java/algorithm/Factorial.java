package algorithm;

/**
 * @author simple_huang@foxmail.com on 2018/3/15.
 */
public class Factorial {
    /**
     * 计算n的阶乘尾数0的个数
     * 即可简化为求乘法中5的倍数
     *
     * @param n
     * @return
     */
    public static long getTailZeroCount(int n) {
        if (n == 0) {
            return 0;
        }
        long count = 0;
        while (n > 0) {
            if (n % 5 == 0) {
                count++;
            }
            n--;
        }
        return count;
    }

    //?????网上的一个方式, 超过25结果跟自己的有差异, 感觉哪里不对
//    public static long getTailZeroCountV2(int n) {
//        if (n == 0) {
//            return 0;
//        }
//        long count = 0;
//        while(n > 0){
//            count += n / 5;
//            n = n / 5;
//        }
//        return count;
//    }

    public static long getFactorialResult(int n) {
        if (n == 0) {
            return 1;
        }
        long result = 1;
        while (n > 0) {
            result *= n;
            n--;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 28;
        System.out.println(getFactorialResult(n));
        System.out.println(getTailZeroCount(n));
//        System.out.println(getTailZeroCountV2(n));
    }
}
