package Day03;

public class Solution151 {
    public String reverseWords(String s) {
        // Step 1: Remove extra spaces from start and end
        s = s.trim();

        // Step 2: Split words by one or more spaces
        String[] words = s.split("\\s+");

        // Step 3: Reverse the words manually and build result
        String result = "";
        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i];

            // Add space if not the last word
            if (i > 0) {
                result += " ";
            }
        }

        return result;
    }
}
