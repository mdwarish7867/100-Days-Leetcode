// 1071 Greatest Common Divisor of String

package Day01;

class Solution1071 {
    public String gcdOfStrings(String str1, String str2) {
        // Step 1: Check if both strings are made by repeating the same pattern
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Step 2: Find gcd of lengths
        int len = gcd(str1.length(), str2.length());

        // Step 3: Return substring from 0 to gcd length
        return str1.substring(0, len);
    }

    // Step 4: Helper to find GCD of 2 numbers
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}