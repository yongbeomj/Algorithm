class Solution {
    public String solution(String polynomial) {
        String[] polyArr = polynomial.split(" ");
        int x = 0;
        int constant = 0;

        for (String str : polyArr) {
            if (str.contains("x")) {
                x += str.equals("x") ? 1 : Integer.parseInt(str.replaceAll("x", ""));
            } else if (!str.contains("+")) {
                constant += Integer.parseInt(str);
            }
        }

        String answer = "";
        if (x == 0) {
            answer = String.valueOf(constant);
        } else {
            String xStr = x != 1 ? x + "x" : "x";
            answer = constant != 0 ? xStr + " + " + constant : xStr;
        }

        return answer;
    }
}