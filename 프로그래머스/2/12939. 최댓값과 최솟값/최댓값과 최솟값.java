class Solution {
    public String solution(String s) {
        String[] strArr = s.split(" ");
        int min, max;
        min = max = Integer.parseInt(strArr[0]);

        for (int i = 0; i < strArr.length; i++) {
            int num = Integer.parseInt(strArr[i]);
            if (min > num) {
                min = num;
            }
            
            if (max < num) {
                max = num;
            }
        }

        String answer = min + " " + max;
        return answer;
    }
}