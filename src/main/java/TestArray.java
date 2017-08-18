/**
 * Created by simple_huang@foxmail.com on 2017/8/2.
 */
public class TestArray {
    public static void main(String[] args) {
        char[] arr1 = {'a', 'b', 'v', 'd'};
        char[] arr2 = arr1;
        arr1[1] = 'x';
        System.out.println(arr2);
    }
}
