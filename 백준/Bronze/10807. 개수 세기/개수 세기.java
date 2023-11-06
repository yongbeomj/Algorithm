import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 정수의 총 개수
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // 입력 정수
        }

        int v = sc.nextInt(); // 정수 v (개수를 찾는 정수)
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == v) {
                count++;
            }
        }

        System.out.println(count);
    }
}