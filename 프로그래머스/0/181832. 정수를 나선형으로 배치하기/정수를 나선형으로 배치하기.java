class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int index = 0;
        int num = 1;
        int startRow = 0;
        int startCol = n - 1;
        int endRow = n - 1;
        int endCol = 0;

        while (num <= n * n) {

            switch (index) {
                case 0: {   // 오른쪽 방향
                    for (int i = 0; i < n; i++) {
                        if (answer[startRow][i] == 0) {
                            answer[startRow][i] = num++;
                        }
                    }
                    startRow++;
                    index++;
                    break;
                }

                case 1: {   // 아래 방향
                    for (int i = 0; i < n; i++) {
                        if (answer[i][startCol] == 0) {
                            answer[i][startCol] = num++;
                        }
                    }
                    startCol--;
                    index++;
                    break;
                }

                case 2: {   // 왼쪽 방향
                    for (int i = n - 1; i >= 0; i--) {
                        if (answer[endRow][i] == 0) {
                            answer[endRow][i] = num++;
                        }
                    }
                    endRow--;
                    index++;
                    break;
                }

                case 3: {   // 위쪽 방향
                    for (int i = n - 1; i >= 0; i--) {
                        if (answer[i][endCol] == 0) {
                            answer[i][endCol] = num++;
                        }
                    }
                    endCol++;
                    index = 0;
                    break;
                }
            }
        }

        return answer;
    }
}
