import java.util.stream.IntStream;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;

        if (length1 != length2) {
            return length1 > length2 ? 1 : -1;
        }
        
        int sum1 = IntStream.of(arr1).sum();
        int sum2 = IntStream.of(arr2).sum();
        
        if (sum1 != sum2) {
            return sum1 > sum2 ? 1 : -1;
        }

        return 0;
    }
}