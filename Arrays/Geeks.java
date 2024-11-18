package Arrays;

public class Geeks {
    
        public static int[] findSubarrayWithSum(int[] arr, int n, int s) {
            int start = 0;
            int currentSum = 0;
    
            // Traverse the array
            for (int end = 0; end < n; end++) {
                // Add the current element to the current sum
                currentSum =currentSum + arr[end];
    
                // Shrink the window while the current sum exceeds the target
                while (currentSum > s && start <= end) {
                    currentSum =currentSum - arr[start++];
                   // start++;
                }
    
                // If the current sum matches the target sum, return the 1-based indices
                if (currentSum == s) {
                    return new int[] { start + 1, end + 1 };
                }
            }
    
            // If no subarray is found, return [-1]
            return new int[] { -1 };
        }
    
        public static void main(String[] args) {
            int[] arr = { 1, 2, 3, 7, 5 };
            int n = arr.length;
            int s = 12;
            
            int[] result = findSubarrayWithSum(arr, n, s);
    
            // Print result
            if (result.length == 1 && result[0] == -1) {
                System.out.println("-1");
            }
            else {
                System.out.println(result[0] + " " + result[1]);
            }
         
         
    }
}