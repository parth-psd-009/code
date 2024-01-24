/*
 * @lc app=leetcode id=1539 lang=java
 *
 * [1539] Kth Missing Positive Number
 */

// @lc code=start
// 

import java.util.Arrays;

class Solution {
    public int findKthPositive(int[] arr, int k) {
        boolean[] isPresent = new boolean[1000];
        Arrays.fill(isPresent, false);
        for (int b : arr) {
            isPresent[b] = true;
        }
        int ans = -1;
        for (int i = 0, j = 0; j != k; i++) {
            if(isPresent[i] == false){
                ans = i;
            }
        }
        return ans;
    }

}
// @lc code=end
