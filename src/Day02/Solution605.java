// 605
package Day02;
import java.util.*;
public class Solution605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
       int len = flowerbed.length;

        for (int i = 0; i < len; i++) {
            // If current place is empty
            if (flowerbed[i] == 0) {

                // Check left and right are also empty or out of bounds
                boolean leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                boolean rightEmpty = (i == len - 1) || (flowerbed[i + 1] == 0);

                // If this position is safe to plant
                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1; // Plant flower here
                    n--;              // One less flower to plant

                    if (n == 0) {
                        return true; // Done planting!
                    }
                }
            }
        }

        // After checking all, are any flowers left?
        return n <= 0;
    }
}