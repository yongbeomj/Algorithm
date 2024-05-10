import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr, Collections.reverseOrder());

        String str = String.join("", arr);
        long answer = Long.parseLong(str);
        return answer;
    }
}