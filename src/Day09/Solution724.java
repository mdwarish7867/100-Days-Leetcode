package Day09;

public class Solution724 {
    public int longestOnes(int[] nums, int k) {
     int total = 0, leftSum = 0;

    for (int num : nums) total += num;

    for (int i = 0; i < nums.length; i++) {
        if (leftSum == total - leftSum - nums[i]) {
            return i;
        }
        leftSum += nums[i];
    }

    return -1;
}
}
