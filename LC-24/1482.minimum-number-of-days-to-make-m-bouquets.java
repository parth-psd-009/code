/*
 * @lc app=leetcode id=1482 lang=java
 *
 * [1482] Minimum Number of Days to Make m Bouquets
 */

// @lc code=start
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        long val = (long) m * k;
        int n = bloomDay.length; // Size of the array
        if (val > n)
            return -1;
        System.out.println(m * k);
        System.out.println(bloomDay.length);
        int start = minOfArray(bloomDay);
        int end = maxOfArray(bloomDay);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (checkIfPossible(bloomDay, mid, m, k)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static boolean checkIfPossible(int[] bloomDays, int nthDay, int reqBque, int flowerPerBque) {
        int bqueCount = 0;
        int currentBque = 0;
        for (int i = 0; i < bloomDays.length; i++) {
            if (bloomDays[i] <= nthDay) {
                currentBque++;
            }
            if (bloomDays[i] > nthDay && currentBque < flowerPerBque) {
                currentBque = 0;
            }
            if (currentBque == flowerPerBque) {
                bqueCount++;
                currentBque = 0;
            }
        }
        if (bqueCount >= reqBque)
            return true;
        else
            return false;
    }

    public static int minOfArray(int[] arr) {
        int min = arr[0];
        for (Integer num : arr) {
            if (min > num) {
                min = num;
            }
        }
        return min;
    }

    public static int maxOfArray(int[] arr) {
        int max = arr[0];
        for (Integer num : arr) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }
}

// @lc code=end
