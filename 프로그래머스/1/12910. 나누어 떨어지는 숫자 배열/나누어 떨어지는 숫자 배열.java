import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        
        Collections.sort(list);
        
        int[] answer = {};
        if (list.size() == 0) {
            answer = new int[]{-1};
        } else {
            answer = list.stream().mapToInt(Integer::intValue).toArray();
        }

        return answer;
    }
}