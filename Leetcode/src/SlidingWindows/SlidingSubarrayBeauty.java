//package SlidingWindows;
//
//import java.util.Arrays;
//
//public class SlidingSubarrayBeauty {
//    public static void main(String[] args) {
//        int nums[] = {1,-1,-3,-2,3};
//        int k = 3;
//        int x = 2;
//        for(int y: getSubarrayBeauty(nums, k, x)){
//            System.out.print(y + " ");
//        }
//    }
//
//    /*public static int[] getSubarrayBeauty(int[] nums, int k, int x) {
//        int n = nums.length;
//        int[] countt = new int[n-k+1];
//
//        for(int i = 0; i <= n-k; i++) {
//            int[] window = new int[k];
//
//            // Copy current window
//            for(int j = 0; j < k; j++) {
//                window[j] = nums[i+j];
//            }
//
//            // Sort window
//            Arrays.sort(window);
//
//            // Count negative numbers
//            int count = 0;
//            for(int num : window) {
//                if(num < 0) count++;
//            }
//
//            // If enough negative numbers exist
//            if(count >= x) {
//                int negCount = 0;
//                for(int num : window) {
//                    if(num < 0) {
//                        negCount++;
//                        if(negCount == x) {
//                            countt[i] = num;
//                            break;
//                        }
//                    }
//                }
//            } else {
//                countt[i] = 0;
//            }
//        }
//        return countt;
//    }*/
//    public static int[] getSubarrayBeauty(int[] nums, int k, int x){
//        int n = nums.length;
//        int count[] = new int[101];int z =0;int[] result = new int[n-k+1];
//        for(int y: nums){
//            count[y+50]++;
//        }
//        //result[0] = findXthNegative(count, x);
//        for(int i =k;i<n;i++){
//
//        for(int i: count){
//            if(i<50){
//                z++;
//                if(z >= x) {  // Found xth negative number
//                return i - 50;  // Convert back to original number
//            }
//            }
//        }
//        int n = nums.length;
//        int[] result = new int[n-k+1];
//
//        // Create frequency array for numbers from -50 to 50
//        int[] freq = new int[101];  // Size 101 to handle range [-50,50]
//
//        // Process first window
//        for(int i = 0; i < k; i++) {
//            freq[nums[i] + 50]++;  // Shift by 50 to handle negative numbers
//        }
//
//        // Get beauty value for first window
//        result[0] = findXthNegative(freq, x);
//
//        // Process remaining windows using sliding window
//        for(int i = k; i < n; i++) {
//            // Remove leftmost element of previous window
//            freq[nums[i-k] + 50]--;
//            // Add rightmost element of current window
//            freq[nums[i] + 50]++;
//
//            // Calculate beauty value for current window
//            result[i-k+1] = findXthNegative(freq, x);
//        }
//
//        return result;
//    }
//
//    private static int findXthNegative(int[] freq, int x) {
//        int count = 0;
//        // Check numbers from -50 to 0
//        for(int i = 0; i <= 50; i++) {  // We only need to check up to 0
//            count += freq[i];  // Add frequency of current number
//            if(count >= x) {  // Found xth negative number
//                return i - 50;  // Convert back to original number
//            }
//        }
//        return 0;
//    }
//}