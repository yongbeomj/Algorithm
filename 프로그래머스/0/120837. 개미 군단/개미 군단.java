class Solution {
    public int solution(int hp) {
        int antCnt1 = hp / 5;
        int antCnt2 = (hp % 5) / 3;
        int antCnt3 = (hp % 5) % 3;

        int answer = antCnt1 + antCnt2 + antCnt3;
        return answer;
    }
}