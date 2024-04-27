class Solution {
    public String solution(String myString, String pat) {
        int lastIdx = myString.lastIndexOf(pat);
        String answer = myString.substring(0, lastIdx) + pat;

        return answer;
    }
}