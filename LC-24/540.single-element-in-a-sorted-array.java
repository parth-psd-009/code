/*
 * @lc app=leetcode id=540 lang=java
 *
 * [540] Single Element in a Sorted Array
 */

// @lc code=start
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int start = 1, end = n - 2;
        int mid = start + (end - start) / 2;
        if(n == 1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        else if(nums[n-1] != nums[n-2]) return nums[n-1];
        while(start <= end){
            if(nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]){
                return nums[mid];
            }
            else if((mid % 2 == 1 && nums[mid] == nums[mid - 1]) || (mid % 2 == 0 && nums[mid] == nums[mid + 1])){
                start = mid + 1;
            }
            else{
                end = mid  - 1;
            }
            mid = start + (end - start) / 2;
        }
        return -1;
    }
}
// @lc code=end

