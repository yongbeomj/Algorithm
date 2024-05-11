class Solution {
    public int solution(int n) {
        String str = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        int answer = Integer.parseInt(sb.toString(), 3);
        return answer;
    }
}