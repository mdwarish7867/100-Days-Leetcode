package Day02;
import java.util.*;
public class Solution345 {
    public String reverseVowels(String s) {
        Set<Character> vowels = Set.of('a','e','i','o','u','A','E','I','O','U');
        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;

        while (i < j) {
            // move i forward if not vowel
            while (i < j && !vowels.contains(chars[i])) {
                i++;
            }
            // move j backward if not vowel
            while (i < j && !vowels.contains(chars[j])) {
                j--;
            }
            // swap vowels
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }

        return new String(chars);
    }
}
