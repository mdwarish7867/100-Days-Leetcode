package Day10;

public class Solution1207 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        Set<Integer> freqSet = new HashSet<>();

        // Count occurrences
        for (int n : arr) {
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        }

        // Check if frequencies are unique
        for (int count : freqMap.values()) {
            if (!freqSet.add(count)) {
                return false;  // Duplicate frequency found
            }
        }

        return true;
}
