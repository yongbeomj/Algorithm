class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int maxWidth = board[0] / 2;
        int maxLength = board[1] / 2;

        for (String key : keyinput) {
            if (key.equals("up")) {
                answer[1] += answer[1] < maxLength ? 1 : 0;
            } else if (key.equals("down")) {
                answer[1] -= answer[1] > -maxLength ? 1 : 0;
            } else if (key.equals("left")) {
                answer[0] -= answer[0] > -maxWidth ? 1 : 0;
            } else if (key.equals("right")) {
                answer[0] += answer[0] < maxWidth ? 1 : 0;
            }
        }

        return answer;
    }
}