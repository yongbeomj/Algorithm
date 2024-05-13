import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        List<String> list = Arrays.stream(name).collect(Collectors.toList());

        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                if (list.contains(photo[i][j])) {
                    int idx = list.indexOf(photo[i][j]);
                    answer[i] += yearning[idx];
                }
            }
        }

        return answer;
    }
}