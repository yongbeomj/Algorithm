class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String replaceStr = "";
        
        for (int i = 0; i < myString.length(); i++) {
            replaceStr += (myString.charAt(i) == 'A') ? "B" : "A";
        }
        
        if (replaceStr.contains(pat)) {
            answer = 1;
        }
        
        return answer;
    }
}