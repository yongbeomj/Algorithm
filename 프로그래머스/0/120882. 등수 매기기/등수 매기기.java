import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[] solution(int[][] score) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            int avg = score[i][0] + score[i][1];
            list.add(avg);
        }

        list.sort(Comparator.reverseOrder());

        int[] answer = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            int avg = score[i][0] + score[i][1];
            answer[i] = list.indexOf(avg) + 1;
        }

        return answer;
    }
}