package Day05;

public class Solution283 {
    public void moveZeroes(int[] nums) {
          int lastNonZeroIndex = 0;  // Position to place next non-zero element

        // Move non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap nums[i] with nums[lastNonZeroIndex] if necessary
                int temp = nums[i];
                nums[i] = nums[lastNonZeroIndex];
                nums[lastNonZeroIndex] = temp;

                lastNonZeroIndex++;
            }
        }
    }

}
