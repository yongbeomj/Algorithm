import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            answer += divisor(i) % 2 == 0 ? i : -i;
        }

        return answer;
    }

    private int divisor(int num) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                list.add(i);
            }
        }

        return list.size();
    }
}