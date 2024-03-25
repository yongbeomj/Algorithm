import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] matrixA = new int[n][m];
        int[][] matrixB = new int[n][m];

        for (int i = 0; i < n; i++) {
            StringTokenizer stA = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                matrixA[i][j] = Integer.parseInt(stA.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            StringTokenizer stB = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                matrixB[i][j] = Integer.parseInt(stB.nextToken());
            }
        }
        br.close();

        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(matrixA[i][j] + matrixB[i][j]).append(" ");
            }
            sb.append("\n");
        }
        
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}
