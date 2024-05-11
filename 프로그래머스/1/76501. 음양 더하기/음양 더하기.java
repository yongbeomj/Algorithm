import java.util.Arrays;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        for (int i = 0; i < absolutes.length; i++) {
            if (!signs[i]) {
                absolutes[i] = -absolutes[i];
            }
        }

        int answer = Arrays.stream(absolutes).sum();
        return answer;
    }
}