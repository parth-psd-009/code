/*
 * @lc app=leetcode id=509 lang=java
 *
 * [509] Fibonacci Number
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int fib(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        if (n <= 1) {
            return n;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int res = fib(n - 1) + fib(n - 2);
        memo.put(n, res);
        return res;
    }
}

// @lc code=end
