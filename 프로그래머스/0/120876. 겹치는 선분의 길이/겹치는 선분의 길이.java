class Solution {
    public int solution(int[][] lines) {
        int[] rail = new int[200];
        for (int[] line : lines) {
            for (int i = line[0] + 100; i < line[1] + 100; i++) {
                rail[i]++;
            }
        }

        int answer = 0;
        for (int val : rail) {
            if (val > 1) {
                answer++;
            }
        }

        return answer;
    }
}