class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] strArr = my_string.split("");
        
        for (String str : strArr) {
            answer += str.repeat(n);
        }

        return answer;
    }
}