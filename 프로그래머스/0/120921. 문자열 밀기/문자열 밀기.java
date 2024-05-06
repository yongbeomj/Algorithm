class Solution {
    public int solution(String A, String B) {
        int answer = -1;

        for (int i = 0; i < A.length(); i++) {
            String newWord = A.substring(A.length() - i) + A.substring(0, A.length() - i);
            if (newWord.equals(B)) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}