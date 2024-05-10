import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        int max = nums.length / 2;
        
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int answer = Math.min(set.size(), max);
        return answer;
    }
}