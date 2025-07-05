import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Count frequency of each number
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int result = -1;

        // Find the largest lucky number
        for (int key : freqMap.keySet()) {
            if (key == freqMap.get(key)) {
                result = Math.max(result, key);
            }
        }

        return result;
    }
}
