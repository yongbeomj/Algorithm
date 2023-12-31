import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine()); // 테스트케이스 개수
        int[] changes = {25, 10, 5, 1}; // 동전 단위

        int[][] results = new int[t][4];

        for (int i = 0; i < t; i++) {
            int c = Integer.parseInt(br.readLine()); // 거스름돈

            for (int j = 0; j < 4; j++) {
                results[i][j] = c / changes[j]; // 필요 동전 개수
                c %= changes[j];
            }
        }

        for (int[] result : results) {
            for (int i : result) {
                System.out.printf("%d ", i);
            }
            System.out.println();
        }
    }
}
