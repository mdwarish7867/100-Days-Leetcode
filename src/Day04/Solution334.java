package Day04;
import java.util.*;
public class Solution334 {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n <= first) {
                first = n;  // smallest so far
            } else if (n <= second) {
                second = n;  // better middle candidate
            } else {
                // Found a number greater than both first and second
                return true;
            }
        }

        return false;  // No triplet found
    }
}