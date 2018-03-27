package sort;

import java.util.concurrent.Callable;

/**
 * @author simple_huang@foxmail.com on 2018/3/26.
 */
public class InsertSortUtil {
    public static void insertionSort( int[] arr ){
        for( int i=0; i<arr.length-1; i++ ) {
            for( int j=i+1; j>0; j-- ) {
                if( arr[j-1] <= arr[j] )
                    break;
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] ints = new int[]{4, 3, 1, 7, 8, 5};
        insertionSort(ints);
    }
}
