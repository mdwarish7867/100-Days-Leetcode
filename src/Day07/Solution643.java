package Day07;

public class Solution643 { public double findMaxAverage(int[] nums, int k) {
         int windowSum = 0;

        // Sum of first k elements
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        // Slide the window
        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];  // Slide window
            maxSum = Math.max(maxSum, windowSum);
        }

        return (double) maxSum / k;
    }
}