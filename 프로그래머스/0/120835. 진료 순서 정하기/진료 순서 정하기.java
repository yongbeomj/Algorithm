import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(int[] emergency) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[emergency.length];
        int[] asc = emergency.clone();

        Arrays.sort(asc);
        
        for (int i = 0; i < emergency.length; i++) {
            map.put(asc[i], emergency.length - i);
        }

        for (int i = 0; i < emergency.length; i++) {
            answer[i] = map.get(emergency[i]);
        }
        
        return answer;
    }
}