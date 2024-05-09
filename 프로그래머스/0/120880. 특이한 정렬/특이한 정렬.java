import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Integer[] arr = Arrays.stream(numlist).boxed().toArray(Integer[]::new);

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int a = Math.abs(o1 - n);
                int b = Math.abs(o2 - n);

                return a == b ? o2 - o1 : a - b;
            }
        });

        int[] answer = Arrays.stream(arr).mapToInt(i -> i).toArray();
        return answer;
    }
}