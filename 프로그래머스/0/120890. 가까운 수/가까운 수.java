import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] array, int n) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        list.add(n);

        Collections.sort(list);

        int answer = 0;
        int idx = list.indexOf(n);
        
        if (idx == 0) {
            answer = list.get(idx + 1);
        } else if (idx == list.size() - 1) {
            answer = list.get(idx - 1);
        } else {
            int num1 = list.get(idx - 1);
            int num2 = list.get(idx + 1);

            answer = Math.abs(n - num1) > Math.abs(n - num2) ? num2 : num1;
        }

        return answer;
    }
}