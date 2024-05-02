import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }

        int mode = 0;
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount) {
                maxCount = count;
                mode = key;
            } else if (count == maxCount) {
                mode = -1;
            }
        }
        
        return mode;
    }
}