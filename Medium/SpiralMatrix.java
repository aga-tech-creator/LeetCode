import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            int m, n, k = 0, max = 0, count = 0;
            m = matrix.length;
            n = matrix[0].length;
            List<Integer> results = new ArrayList<>();

            if (m > n)
                max = m / 2 + 1;
            else
                max = n / 2 + 1;

            while (k <= max) {
                for (int i = k; i < n - k; i++) {
                    results.add(matrix[k][i]);
                    count++;
                }
                if (count == n * m)
                    break;

                for (int i = k + 1; i < m - k; i++) {
                    results.add(matrix[i][n - k - 1]);
                    count++;
                }
                if (count == n * m)
                    break;
                for (int i = n - k - 2; i >= k; i--) {
                    results.add(matrix[m - k - 1][i]);
                    count++;
                }
                if (count == n * m)
                    break;

                for (int i = m - k - 2; i > k; i--) {
                    results.add(matrix[i][k]);
                    count++;
                }
                if (count == n * m)
                    break;

                k++;
            }

            return results;
        }
    }
}
