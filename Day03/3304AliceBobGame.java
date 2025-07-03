
class Solution {

    public char kthCharacter(int k) {
        String s = "a";
        int len = 1;

        // Step 1: Grow length until we reach at least k
        while (len < k) {
            len *= 2;
        }

        return getKth(k, len);
    }

    private char getKth(int k, int len) {
        if (len == 1) {
            return 'a';
        }

        int half = len / 2;

        if (k <= half) {
            return getKth(k, half); // Comes from original
        } else {
            char prevChar = getKth(k - half, half);
            return nextChar(prevChar); // Comes from transformed part
        }
    }

    private char nextChar(char ch) {
        return ch == 'z' ? 'a' : (char) (ch + 1);
    }
}
