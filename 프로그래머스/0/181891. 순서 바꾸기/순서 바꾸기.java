import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] frontArr = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] backArr = Arrays.copyOfRange(num_list, 0, n);

        int[] answer = new int[num_list.length];
        System.arraycopy(frontArr, 0, answer, 0, frontArr.length);
        System.arraycopy(backArr, 0, answer, frontArr.length, backArr.length);

        return answer;
    }
}