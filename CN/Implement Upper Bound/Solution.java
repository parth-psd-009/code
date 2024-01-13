public class Solution {

    public static int upperBound(int[] arr, int x, int n) {
        int start = 0, end = n - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (arr[mid] <= x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return end + 1;

    }
}