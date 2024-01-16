/*
 * @lc app=leetcode id=1011 lang=java
 *
 * [1011] Capacity To Ship Packages Within D Days
 */

// @lc code=start
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start = max(weights);
        int end = totalWeight(weights);
        int mid = start + (end - start) / 2;
        int res = -1;
        while (start <= end) {
            if (daysRequired(weights, mid) <= days) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return res;
    }

    public int totalWeight(int[] weights) {
        int sum = 0;
        for (int weight : weights) {
            sum += weight;
        }
        return sum;
    }

    public int daysRequired(int[] weights, int capacity) {
        int day = 1;
        int load = 0;
        for (int i = 0; i < weights.length; i++) {
            if (load + weights[i] > capacity) {
                day++;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }
        return day;
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
