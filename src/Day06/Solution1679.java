package Day06;

public class Solution1679 {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int pairs = 0;

        for (int num : nums) {
            int complement = k - num;

            if (map.getOrDefault(complement, 0) > 0) {
                pairs++;
                map.put(complement, map.get(complement) - 1);
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        return pairs;
    }
}