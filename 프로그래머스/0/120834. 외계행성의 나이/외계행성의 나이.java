class Solution {
    public String solution(int age) {
        String answer = "";
        String[] strAge = String.valueOf(age).split("");
        String alpAge = "abcdefghij";

        for (int i = 0; i < strAge.length; i++) {
            answer += alpAge.charAt(Integer.parseInt(strAge[i]));

        }

        return answer;
    }
}