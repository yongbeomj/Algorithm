import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int value = numbers[i] + numbers[j];
                if (!list.contains(value)) {
                    list.add(value);
                }
            }
        }

        Collections.sort(list);

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}