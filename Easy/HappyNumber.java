package Easy;

public class HappyNumber {
    class Solution {
        public boolean isHappy(int n) {
            while (n != 1) {
                n = sumSquares(n);
                if (n == 145)
                    return false;
            }

            return true;

        }

        private int sumSquares(int n) {
            if (n < 10) {
                return n * n;
            }

            return (n % 10) * (n % 10) + sumSquares(n / 10);
        }
    }
}
