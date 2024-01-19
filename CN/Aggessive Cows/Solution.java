import java.util.Arrays;
public class Solution {
    public static int aggressiveCows(int []stalls, int k) {
        Arrays.sort(stalls);
        int n = stalls.length;
        int start = 1, end = stalls[n - 1] - stalls[0];
        int mid = start + (end - start) / 2;
        int res = 0;
        while(start <= end){
            if(isPossible(stalls, mid,  k)){
                start = mid + 1;
                res = mid;
            }
            else{
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return res;
    }

    public static boolean isPossible(int[] stalls, int dist, int cows) {
        int n = stalls.length; //size of array
        int cntCows = 1; //no. of cows placed
        int last = stalls[0]; //position of last placed cow.
        for (int i = 1; i < n; i++) {
            if (stalls[i] - last >= dist) {
                cntCows++; //place next cow.
                last = stalls[i]; //update the last location.
            }
            if (cntCows >= cows) return true;
        }
        return false;
    }
    public static int max(int[] arr){
        int max = arr[0];
        for(int i : arr){
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    public static int min(int[] arr){
        int min = arr[0];
        for(int i : arr){
            if(i < min){
                min = i;
            }
        }
        return min;
    }
}