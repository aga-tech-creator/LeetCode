public class WhereWillTheBallFall {
    class Solution {
        public int[] findBall(int[][] grid) {
            int column;
            int m = grid.length;
            int n = grid[0].length;
            int[] answer = new int[n];
            boolean flag = false;

            if (n == 1) {
                answer[0] = -1;
                return answer;
            }

            for (int i = 0; i < n; i++) {
                column = i;

                for (int j = 0; j < m; j++) {
                    if (column == 0) {
                        if (grid[j][column] != grid[j][column + 1] || grid[j][column] == -1) {
                            answer[i] = -1;
                            flag = true;
                            break;
                        } else {
                            column++;
                        }
                    } else if (column == n - 1) {
                        if (grid[j][column] != grid[j][column - 1] || grid[j][column] == 1) {
                            answer[i] = -1;
                            flag = true;
                            break;
                        } else {
                            column--;
                        }
                    } else if (grid[j][column] == 1 && grid[j][column + 1] == 1)
                        column++;
                    else if (grid[j][column] == -1 && grid[j][column - 1] == -1)
                        column--;
                    else {
                        answer[i] = -1;
                        flag = true;
                        break;
                    }
                }

                if (!flag)
                    answer[i] = column;

                flag = false;
            }

            return answer;
        }
    }
}
