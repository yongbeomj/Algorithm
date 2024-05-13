class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int gcd = getGCD(answer, arr[i]);
            answer = (answer * arr[i]) / gcd;
        }

        return answer;
    }

    private int getGCD(int num1, int num2) {
        return num1 % num2 == 0 ? num2 : getGCD(num2, num1 % num2);
    }
}