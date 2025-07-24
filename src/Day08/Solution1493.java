package Day08;

public class Solution1493 {
    public int longestSubarray(int[] nums) {
    int left = 0, zeros = 0, maxLength = 0;

    for (int right = 0; right < nums.length; right++) {
        if (nums[right] == 0) zeros++;

        while (zeros > 1) {
            if (nums[left] == 0) zeros--;
            left++;
        }

        maxLength = Math.max(maxLength, right - left);
    }

    return maxLength;
}

}
