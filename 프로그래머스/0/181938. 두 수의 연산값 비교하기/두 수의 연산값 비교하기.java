class Solution {
    public int solution(int a, int b) {
        int val_1 = Integer.parseInt("" + a + b);
        int val_2 = 2 * a * b;

        return val_1 > val_2 || val_1 == val_2 ? val_1 : val_2;
    }
}