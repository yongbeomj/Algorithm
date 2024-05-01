import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] array, int n) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        int answer = Collections.frequency(list, n);
        
        return answer;
    }
}