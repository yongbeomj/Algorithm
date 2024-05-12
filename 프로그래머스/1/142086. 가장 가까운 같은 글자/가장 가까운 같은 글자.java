class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = s.substring(0, i).lastIndexOf(ch);

            answer[i] = idx != -1 ? i - idx : -1;
        }

        return answer;
    }
}