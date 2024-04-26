class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for (int num : num_list) {
            answer += actionCnt(num);
        }

        return answer;
    }

    public static int actionCnt(int num) {
        int count = 0;
        while (num != 1) {
            num = num % 2 == 0 ? num / 2 : (num - 1) / 2;
            count++;
        }

        return count;
    }
}