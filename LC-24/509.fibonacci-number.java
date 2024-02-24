/*
 * @lc app=leetcode id=509 lang=java
 *
 * [509] Fibonacci Number
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    // public int fib(int n) {
    // Map<Integer, Integer> memo = new HashMap<>();
    // if (n <= 1) {
    // return n;
    // }
    // if (memo.containsKey(n)) {
    // return memo.get(n);
    // }
    // int res = fib(n - 1) + fib(n - 2);
    // memo.put(n, res);
    // return res;
    // }

    // public int fib(int n) {
    // Map<Integer, Integer> tab = new HashMap<>();
    // tab.put(0, 0);
    // tab.put(1, 1);
    // for (int i = 2; i <= n; i++) {
    // tab.put(n, tab.get(n - 1) + tab.get(n - 2));
    // }
    // return tab.get(n);
    // }
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int prev2 = 0;
        int prev = 1;
        for (int i = 2; i <= n; i++) {
            int current = prev + prev2;
            prev2 = prev;
            prev = current;
        }
        return prev;
    }
}

// @lc code=end
