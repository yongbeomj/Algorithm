class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int pow = 1;

        while (length > pow) {
            pow *= 2;
        }

        int[] answer = new int[pow];
        System.arraycopy(arr, 0, answer, 0, arr.length);

        return answer;
    }
}