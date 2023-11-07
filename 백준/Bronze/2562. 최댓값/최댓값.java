import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        int max = arr[0]; // 최대값
        int index = 0; // index

        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt(); // 숫자 입력
            if (arr[i] > max) {
                max = arr[i];
                index = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}