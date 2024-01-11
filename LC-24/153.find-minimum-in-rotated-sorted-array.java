/*
 * @lc app=leetcode id=153 lang=java
 *
 * [153] Find Minimum in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int findMin(int[] nums) {
        int N = nums.length;
        if (N == 1) {
            return nums[0];
        }
        int start = 0, end = N - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            int next = (mid + 1) % N;
            int prev = (mid + N - 1) % N;
            if (nums[mid] < nums[prev] && nums[mid] < nums[next]) {
                return nums[mid];
            } else if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return -1;
    }
}
// @lc code=end
