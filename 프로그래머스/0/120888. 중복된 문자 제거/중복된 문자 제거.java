import java.util.HashSet;
import java.util.Set;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();

        for (char ch : my_string.toCharArray()) {
            if (set.add(ch)) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}