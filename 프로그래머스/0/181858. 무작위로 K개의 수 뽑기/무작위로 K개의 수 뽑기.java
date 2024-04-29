import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] distinctArr = Arrays.stream(arr).distinct().toArray();
        int[] answer = Arrays.copyOfRange(distinctArr, 0, k);

        if (distinctArr.length < k) {
            Arrays.fill(answer, distinctArr.length, k, -1);    
        }
        

        return answer;
    }
}