import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        for (String intStr : intStrs) {
            int val = Integer.parseInt(intStr.substring(s, s + l));
            if (val > k) {
                answer.add(val);
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}