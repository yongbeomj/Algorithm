class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;

        for (int i = 3; i <= total; i++) {
            if (total % i == 0) {
                int row = total / i;
                int col = i;

                if (col >= row) {
                    if ((col - 2) * (row - 2) == yellow) {
                        answer[0] = col;
                        answer[1] = row;
                    }
                }
            }
        }

        return answer;
    }
}