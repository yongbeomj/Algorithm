import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                min = Math.min(min, i);
                max = Math.max(max, i);
            }
        }

        return max >= min ? Arrays.copyOfRange(arr, min, max + 1) : new int[]{-1};
    }
}