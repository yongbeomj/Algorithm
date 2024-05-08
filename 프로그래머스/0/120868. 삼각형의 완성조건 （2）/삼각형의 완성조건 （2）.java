import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int min = sides[0];
        int max = sides[1];

        int answer = (max + min) - (max - min) - 1;
        return answer;
    }
}