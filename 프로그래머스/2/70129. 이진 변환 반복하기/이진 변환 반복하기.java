class Solution {
    public int[] solution(String s) {
        int change = 0;
        int count = 0;
        String prev = s;

        while (true) {
            change++;

            String next = prev.replace("0", "");
            count += prev.length() - next.length();
            prev = Integer.toBinaryString(next.length());

            if (prev.equals("1")) {
                break;
            }
        }

        int[] answer = {change, count};
        return answer;
    }
}