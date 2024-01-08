/**
 * BinarySearch704
 */
public class BinarySearch704 {
    public static void main(String[] args) {

    }

    public static int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target)
                return mid;
            else if (target > nums[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static int searchRecursive(int[] nums, int target, int low, int high) {
        int n = nums.length;
        low = 0;
        high = n - 1;
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (target == nums[mid]) {
            return mid;
        } else if (target > nums[mid]) {
            return searchRecursive(nums, target, mid + 1, high);
        } else {
            return searchRecursive(nums, target, low, mid - 1);
        }
    }
}