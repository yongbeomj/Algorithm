class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;

        if (a != b && a != c && b != c) {
            answer += square(a, b, c, 1);
        } else if (a == b && a == c) {
            answer += square(a, b, c, 1) * square(a, b, c, 2) * square(a, b, c, 3);
        } else {
            answer += square(a, b, c, 1) * square(a, b, c, 2);
        }
        
        return answer;
    }
    
    public static int square(int a, int b, int c, int n) {
        return (int) (Math.pow(a, n) + Math.pow(b, n) + Math.pow(c, n));
    }
}