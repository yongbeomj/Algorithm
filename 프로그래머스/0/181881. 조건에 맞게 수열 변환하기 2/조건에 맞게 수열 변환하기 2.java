import java.util.Arrays;

public class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] beforeArr;

        while (true) {
            beforeArr = arr.clone();

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0 && arr[i] >= 50) {
                    arr[i] = arr[i] / 2;
                } else if (arr[i] % 2 == 1 && arr[i] < 50) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }

            if (Arrays.equals(beforeArr, arr)) {
                return answer;
            } else {
                answer++;
            }
        }
    }
}