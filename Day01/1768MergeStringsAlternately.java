// You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

// Return the merged string.

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();

        int i = 0, j = 0;
        int n = word1.length(), m = word2.length();

        // Merge characters alternately
        while (i < n && j < m) {
            result.append(word1.charAt(i++));
            result.append(word2.charAt(j++));
        }

        // Append the remaining part of word1
        while (i < n) {
            result.append(word1.charAt(i++));
        }

        // Append the remaining part of word2
        while (j < m) {
            result.append(word2.charAt(j++));
        }

        return result.toString();
    }
}