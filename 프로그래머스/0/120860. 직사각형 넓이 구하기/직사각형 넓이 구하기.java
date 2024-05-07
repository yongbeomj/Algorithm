class Solution {
    public int solution(int[][] dots) {
        int w = 0;
        int h = 0;
        int x = dots[0][0];
        int y = dots[0][1];

        for (int i = 0; i < dots.length; i++) {
            if (x == dots[i][0] || y == dots[i][1]) {
                continue;
            }

            w = Math.abs(x - dots[i][0]);
            h = Math.abs(y - dots[i][1]);
        }

        return w * h;
    }
}