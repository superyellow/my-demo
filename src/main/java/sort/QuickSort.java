package sort;

/**
 * @author simple_huang@foxmail.com on 2017/10/17.
 */
public class QuickSort {
//    public static int getMiddle(int[] ints, int low, int high) {
//        int tmp = ints[low];
//        while(low<high) {
//            while(low<high && ints[high]>=tmp) {
//                high--;
//            }
//            ints[low]=ints[high];
//            while(low<high && ints[low]<=tmp) {
//                low++;
//            }
//            ints[high]=ints[low];
//        }
//        ints[low]=tmp;
//        return low;
//    }
//
//    public static int[] sort(int[] ints, int low, int high) {
//        if (low<high) {
//            int middle = getMiddle(ints, low, high);
//            sort(ints, low, middle-1);
//            sort(ints, middle+1, high);
//        }
//        return ints;
//    }
//
//    public static void print(int[] list) {
//        for (int i: list) {
//            System.out.print(i + " ");
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] ints = {13,27,49,78,34,12,64,5,4,62,99,9};
//        print(sort(ints, 0, ints.length-1));
//    }
}
