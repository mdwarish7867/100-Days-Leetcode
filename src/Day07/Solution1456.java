package Day07;

public class Solution1456 { public int maxVowels(String s, int k) {
         Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int count = 0;
        int maxCount = 0;

        // Count vowels in the first window
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                count++;
            }
        }
        maxCount = count;

        // Slide the window
        for (int i = k; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                count++;
            }
            if (vowels.contains(s.charAt(i - k))) {
                count--;
            }
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}