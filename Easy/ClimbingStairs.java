package Easy;

public class ClimbingStairs {
    class Solution {
        public int climbStairs(int n) {
            int[] memo = new int[n + 1];
            memo[0] = 1;

            for (int i = 1; i < memo.length; i++) {
                if ((i - 1) >= 0)
                    memo[i] += memo[i - 1];
                if ((i - 2) >= 0)
                    memo[i] += memo[i - 2];

            }
            return memo[n];
        }
    }
}
