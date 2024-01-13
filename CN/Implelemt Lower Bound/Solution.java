public class Solution {

    public static int lowerBound(int[] arr, int n, int x) {
        int start = 0, end = n - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (arr[mid] >= x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return start;
        
    }
}