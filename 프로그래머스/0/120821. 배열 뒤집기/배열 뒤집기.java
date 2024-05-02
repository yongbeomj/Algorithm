import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> list = IntStream.of(num_list).boxed().collect(Collectors.toList());
        Collections.reverse(list);
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}