class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] strs = quiz[i].split(" ");
            int left = 0;
            if (strs[1].equals("+")) {
                left = Integer.parseInt(strs[0]) + Integer.parseInt(strs[2]);
            } else {
                left = Integer.parseInt(strs[0]) - Integer.parseInt(strs[2]);
            }

            answer[i] = left == Integer.parseInt(strs[4]) ? "O" : "X";
        }

        return answer;
    }
}