package Day04;

public class Solution443 {
    public int compress(char[] chars) {
         int index = 0;  // Write pointer
        int i = 0;      // Read pointer

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            // Count occurrences of currentChar
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            // Write the character
            chars[index++] = currentChar;

            // If count > 1, write its digits
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }


}
