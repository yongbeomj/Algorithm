import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int solution(String num_str) {
        String[] strArr = num_str.split("");
        int[] numArr = Arrays.stream(strArr).mapToInt(Integer::parseInt).toArray();
        int answer = IntStream.of(numArr).sum();

        return answer;
    }
}