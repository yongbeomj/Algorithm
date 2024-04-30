import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i]) {
                map.put(rank[i], i);
            }
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        int a = map.get(list.get(0));
        int b = map.get(list.get(1));
        int c = map.get(list.get(2));

        int answer = 10000 * a + 100 * b + c;

        return answer;
    }
}