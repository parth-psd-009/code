/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
import java.util.*;
import java.io.*;

class Solution {
    public int climbStairs(int n) {
        // memo.put(0, 0);
        if (n <= 2) {
            return n;
        }
        int prev2 = 1;
        int prev = 2;
        // memo.put(1, 1);
        // memo.put(2, 2);
        for (int i = 3; i <= n; i++) {
            int curr = prev + prev2;
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}
// @lc code=end
