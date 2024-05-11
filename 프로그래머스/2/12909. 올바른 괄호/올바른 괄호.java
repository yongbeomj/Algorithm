class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int match = 0;

        for (int i = 0; i < s.length(); i++) {
            match += s.charAt(i) == '(' ? 1 : -1;

            if (match < 0) {
                break;
            }
        }

        if (match == 0) {
            answer = true;
        }
        
        return answer;
    }
}