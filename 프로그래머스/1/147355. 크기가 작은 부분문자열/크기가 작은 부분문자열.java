class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int length = t.length() - p.length();

        for (int i = 0; i <= length; i++) {
            String str = t.substring(i, i + p.length());
            if (Long.parseLong(str) <= Long.parseLong(p)) {
                answer++;
            }
        }

        return answer;
    }
}