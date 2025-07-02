class Solution {
    public int possibleStringCount(String word, int k) {
        int MOD = 1_000_000_007;
        int n = word.length();

        // Step 1: Get group lengths
        List<Integer> groups = new ArrayList<>();
        for (int i = 0; i < n; ) {
            int j = i;
            while (j < n && word.charAt(j) == word.charAt(i)) j++;
            groups.add(j - i);
            i = j;
        }

        // Step 2: DP
        int maxLen = n;
        int[] dp = new int[maxLen + 1];
        dp[0] = 1; // 1 way to build string of length 0

        for (int g : groups) {
            int[] newDp = new int[maxLen + 1];
            for (int len = 0; len <= maxLen; len++) {
                if (dp[len] == 0) continue;
                for (int take = 1; take <= g; take++) {
                    if (len + take <= maxLen) {
                        newDp[len + take] = (newDp[len + take] + dp[len]) % MOD;
                    }
                }
            }
            dp = newDp;
        }

        // Step 3: Sum valid results
        long ans = 0;
        for (int i = k; i <= maxLen; i++) {
            ans = (ans + dp[i]) % MOD;
        }

        return (int) ans;
    }
}