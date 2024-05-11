import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if (arr.length == 1) {
            return new int[]{-1};
        }

        int[] tempArr = arr.clone();
        Arrays.sort(tempArr);

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int idx = list.indexOf(tempArr[0]);
        list.remove(idx);

        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}