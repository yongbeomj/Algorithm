import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] strArr = s.split(" ");
        int[] numArr = Arrays.stream(strArr).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(numArr);

        String answer = numArr[0] + " " + numArr[numArr.length - 1];
        return answer;
    }
}