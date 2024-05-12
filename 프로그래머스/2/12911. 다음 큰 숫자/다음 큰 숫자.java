class Solution {
    public int solution(int n) {
        int answer = 0;
        String strN = Integer.toBinaryString(n);
        strN = strN.replace("0", "");

        while (true) {
            String nextStr = Integer.toBinaryString(++n);
            nextStr = nextStr.replace("0", "");

            if (strN.length() == nextStr.length()) {
                answer = n;
                break;
            }
        }

        return answer;
    }
}