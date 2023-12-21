import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arrA = new int[n][m];
        int[][] arrB = new int[n][m];

        for (int i = 0; i < arrA.length; i++) {
            StringTokenizer stA = new StringTokenizer(br.readLine());
            for (int j = 0; j < arrA[i].length; j++) {
                arrA[i][j] = Integer.parseInt(stA.nextToken());
            }
        }

        for (int i = 0; i < arrB.length; i++) {
            StringTokenizer stB = new StringTokenizer(br.readLine());
            for (int j = 0; j < arrB[i].length; j++) {
                arrB[i][j] = Integer.parseInt(stB.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%d ", arrA[i][j] + arrB[i][j]);
            }
            System.out.println();
        }

        br.close();
    }
}
