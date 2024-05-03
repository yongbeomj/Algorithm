class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= 10; i++) {
            if (n >= factorial(i)) {
                answer = i;
            } else {
                break;
            }
        }

        return answer;
    }

    public static int factorial(int n) {
        return n != 1 ? n * factorial(n - 1) : 1;
    }
}