class Solution {
    public char kthCharacter(long k, int[] operations) {
        int n = operations.length;
        long[] lengths = new long[n + 1];
        lengths[0] = 1; // initially "a"

        // Step 1: Calculate lengths after each operation
        for (int i = 0; i < n; i++) {
            lengths[i + 1] = Math.min(lengths[i] * 2, k); // we don't need more than k
        }

        // Step 2: Reverse simulation
        char ch = 'a'; // initial character
        for (int i = n - 1; i >= 0; i--) {
            long half = lengths[i];

            if (k > half) {
                k -= half;
                if (operations[i] == 1) {
                    // came from shifted part → unshift character
                    ch = (char) ((ch - 'a' + 1) % 26 + 'a');
                }
                // else: came from a copy, keep ch as is
            }
            // else: k is still in the first half (original), so continue
        }

        return ch;
    }
}
