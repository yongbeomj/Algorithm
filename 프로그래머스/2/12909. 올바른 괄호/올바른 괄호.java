class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int match = 0;

        for (int i = 0; i < s.length(); i++) {
            match += s.charAt(i) == '(' ? 1 : -1;

            if (match < 0) {
                answer = false;
                break;
            }
        }

        answer = match == 0 ? true : false;
        return answer;
    }
}