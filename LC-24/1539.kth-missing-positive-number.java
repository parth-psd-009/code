/*
 * @lc app=leetcode id=1539 lang=java
 *
 * [1539] Kth Missing Positive Number
 */

// @lc code=start

import java.util.ArrayList;

class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> missing = new ArrayList<>();
        for (int i = 1; i < arr[arr.length - 1]; i++) {
            if (isMissing(arr, i)) {
                missing.add(i);
            }
        }
        if (missing.size() > 1) {
            return missing.get(k - 1);

        }
        return -1;

    }

    public boolean isMissing(int[] arr, int k) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == k) {
                return false;
            } else if (arr[mid] > k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return true;
    }
}
// @lc code=end
