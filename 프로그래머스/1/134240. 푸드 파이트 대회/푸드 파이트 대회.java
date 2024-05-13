class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            if (food[i] / 2 >= 1) {
                String str = String.valueOf(i).repeat(food[i] / 2);
                sb.append(str);
            }
        }

        answer += sb.toString() + "0";
        answer += sb.reverse().toString();

        return answer;
    }
}