/*
 * @lc app=leetcode id=1283 lang=java
 *
 * [1283] Find the Smallest Divisor Given a Threshold
 */

// @lc code=start

class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        if (nums.length > threshold) {
            return -1;
        }
        int start = 1;
        int end = max(nums);
        int mid = start + (end - start) / 2;
        int res = -1;
        while (start <= end) {
            if (sumOfDivisions(nums, mid) <= threshold) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return res;
    }

    public static int sumOfDivisions(int[] arr, int divisor) {
        int sum = 0;
        for (int i : arr) {
            sum = sum + (int) Math.ceil((double) i / divisor);
        }
        return sum;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
// @lc code=end