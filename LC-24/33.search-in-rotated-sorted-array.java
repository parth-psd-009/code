/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int N = nums.length - 1;
        int start = 0, end = N - 1;
        int rotations = timesRotated(nums, N);
        int bs1 = binarySearch(nums, start, rotations - 1, target);
        int bs2 = binarySearch(nums, rotations, end, target);
        if (bs1 > bs2) {
            return bs1;
        }
        return bs2;
    }

    public int binarySearch(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public int timesRotated(int[] nums, int size) {
        int start = 0, end = size - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            int next = (mid + 1) % size;
            int prev = (mid + size - 1) % size;
            if (nums[mid] < nums[prev] && nums[mid] < nums[next]) {
                return mid;
            } else if (nums[mid] > nums[start]) {
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
