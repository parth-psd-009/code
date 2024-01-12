/*
 * @lc app=leetcode id=875 lang=java
 *
 * [875] Koko Eating Bananas
 */

// @lc code=start
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxSize = findMax(piles);
        int ans = maxSize;
        int start = 1, end = maxSize;
        int mid = start + (end - start) / 2;
        while(start <= end){
            if(hoursTaken(piles,mid) <= h && mid <= ans){
                ans = mid;
                end = mid - 1;
            }
            else if(hoursTaken(piles,mid) > h){
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }
    
    public int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


    public int hoursTaken(int[] piles, int rate) {
        int total = 0;
        for (int i = 0; i < piles.length; i++) {
            total += Math.ceil((double)(piles[i]) / (double)(rate));
        }
        return total;
    }
}
// @lc code=end

