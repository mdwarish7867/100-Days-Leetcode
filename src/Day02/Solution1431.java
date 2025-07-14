//1431 Kids with the Greatest Number of Candis

package Day02;
import java.util.*;
class Solution1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();  

        int maxCandies = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > maxCandies) {
                maxCandies = candies[i];
            }
        }

        for(int c : candies){
            if (c + extraCandies >= maxCandies){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}