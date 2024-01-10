/*
 * @lc app=leetcode id=34 lang=java
 *
 * [34] Find First and Last Position of Element in Sorted Array
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = { firstOccurence(nums, target), lastOccurence(nums, target) };
        return res;
    }

    public int firstOccurence(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int mid = start + (end - start) / 2;
        int res = -1;
        while (start <= end) {
            if (nums[mid] == target) {
                res = mid;
                end = mid - 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return res;
    }

    public int lastOccurence(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int mid = start + (end - start) / 2;
        int res = -1;
        while (start <= end) {
            if (nums[mid] == target) {
                res = mid;
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return res;
    }

}
// @lc code=end
