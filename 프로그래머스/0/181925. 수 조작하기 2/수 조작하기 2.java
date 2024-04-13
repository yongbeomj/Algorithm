class Solution {
    public String solution(int[] numLog) {
        String answer = "";

        for (int i = 1; i < numLog.length; i++) {
            int val = numLog[i] - numLog[i - 1];

            if (val == 1) {
                answer += "w";
            } else if (val == -1) {
                answer += "s";
            } else if (val == 10) {
                answer += "d";
            } else {
                answer += "a";
            }
        }

        return answer;
    }
}