class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int a = i; a <= j; a++) {
            String str = String.valueOf(a);
            if (str.contains("" + k)) {
                String[] strArr = str.split("");
                for (String s : strArr) {
                    if (s.equals("" + k)) {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}