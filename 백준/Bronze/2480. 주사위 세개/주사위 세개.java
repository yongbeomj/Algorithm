import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int reward;

        if (a == b && b == c) { // 3개 눈이 모두 같을 경우
            reward = 10000 + a * 1000;
        } else if (a == b || a == c || b == c) { // 2개 눈이 같을 경우
            int sameNum;
            if (a == b) {
                sameNum = a;
            } else if (a == c) {
                sameNum = a;
            } else {
                sameNum = b;
            }

            reward = 1000 + sameNum * 100;
        } else { // 모두 다른 눈일 경우
            int max = Math.max(Math.max(a, b), c);
            reward = max * 100;
        }

        System.out.println(reward);
    }
}