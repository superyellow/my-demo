package sort;

/**
 * @author simple_huang@foxmail.com on 2018/3/26.
 */
public class BinarySearchUtil {
    private BinarySearchUtil() {
    }

    public static int binarySearch(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                low = mid + 1;
            }
            if (nums[mid] > target) {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{1, 2, 4, 5, 6, 8};
        System.out.println(binarySearch(ints, 1));
        System.out.println(binarySearch(ints, 7));
    }
}
