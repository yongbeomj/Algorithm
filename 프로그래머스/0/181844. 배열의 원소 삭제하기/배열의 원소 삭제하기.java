import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = IntStream.of(arr).boxed().collect(Collectors.toList());
        
        for (int del : delete_list) {
            int idx = list.indexOf(del);
            if (idx != -1) {
                list.remove(idx);
            }
        }

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}