class Solution {
    public int solution(int num, int k) {
        String[] strNum = String.valueOf(num).split("");

        for (int i = 0; i < strNum.length; i++) {
            if (strNum[i].equals("" + k)) {
                return i + 1;
            }
        }

        return -1;
    }
}