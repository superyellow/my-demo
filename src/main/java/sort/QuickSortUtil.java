package sort;

/**
 * @author simple_huang@foxmail.com on 2017/8/25.
 */
public class QuickSortUtil {
    /**
     * 私有化构造器
     */
    private QuickSortUtil(){}

    public static int[] quickSortInt(int[] ints, int low, int high) {
        //递归实现
        if (low < high) {
            int middle = getMiddle(ints, low, high);
            quickSortInt(ints, low, middle - 1);
            quickSortInt(ints, middle + 1, high);
        }
        return ints;
    }

    public static int getMiddle(int[] ints, int low, int high) {
        int tmp = ints[low];
        while (low<high) {
            while (low<high && ints[high]>=tmp) {
                high--;
            }
            ints[low] = ints[high];
            while (low<high && ints[low]<=tmp){
                low++;
            }
            ints[high] = ints[low];
        }
        ints[low] = tmp;
        return low;
    }

    public static void print(int[] list) {
        for (int i: list) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] array={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
        getMiddle(array, 0, array.length-1);
        print(array);

        System.out.println("\n");
        quickSortInt(array, 0, array.length-1);
        print(array);
    }
}
