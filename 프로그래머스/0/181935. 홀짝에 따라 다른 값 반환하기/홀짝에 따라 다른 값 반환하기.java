class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n % 2 == 1) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    continue;
                }

                answer += i;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 1) {
                    continue;
                }

                answer += Math.pow(i, 2);
            }
        }

        return answer;
    }
}