import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        int[] answer = IntStream.rangeClosed(1, n).filter(value -> value % 2 == 1).toArray();
        return answer;
    }
}