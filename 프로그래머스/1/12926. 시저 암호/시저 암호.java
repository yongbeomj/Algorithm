class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                answer += arr[i];
                continue;
            }

            if (arr[i] >= 'a' && arr[i] <= 'z') {
                if (arr[i] + n > 'z') {
                    answer += (char) (arr[i] + n - 26);
                } else {
                    answer += (char) (arr[i] + n);
                }
            } else if (arr[i] >= 'A' && arr[i] <= 'Z') {
                if (arr[i] + n > 'Z') {
                    answer += (char) (arr[i] + n - 26);
                } else {
                    answer += (char) (arr[i] + n);
                }
            }
        }
        
        return answer;
    }
}