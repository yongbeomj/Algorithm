class Solution {
    public int solution(int a, int b) {
        int val_1 = Integer.parseInt("" + a + b);
        int val_2 = Integer.parseInt("" + b + a);

        if (val_1 > val_2) {
            return val_1;
        } else {
            return val_2;
        }
    }
}