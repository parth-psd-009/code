public class Solution {
    public static int NthRoot(int n, int m) {
        int start = 1, end = m;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (Math.pow(mid, n) == m) {
                return mid;
            } else if (Math.pow(mid, n) < m) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return -1;
    }
}
