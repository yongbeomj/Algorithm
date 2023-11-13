import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(); // 바구니 번호 (시작)
            int b = sc.nextInt(); // 바구니 번호 (끝)
            int c = sc.nextInt(); // 바구니에 넣을 번호

            for (int j = a - 1; j < b; j++) {
                arr[j] = c;
            }
        }

        for (int k : arr) {
            System.out.print(k + " ");
        }
    }
}