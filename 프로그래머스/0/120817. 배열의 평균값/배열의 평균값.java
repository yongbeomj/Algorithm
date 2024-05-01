import java.util.stream.IntStream;

class Solution {
    public double solution(int[] numbers) {
        int sum = IntStream.of(numbers).sum();
        double average = (double) sum / numbers.length;

        return average;
    }
}