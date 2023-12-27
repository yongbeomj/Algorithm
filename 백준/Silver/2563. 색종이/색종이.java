import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] paper = new int[100][100]; // 색종이

        int n = Integer.parseInt(br.readLine()); // 색종이 개수

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()); // 색종이 왼쪽 변과 도화지 왼쪽 변 사이 거리
            int y = Integer.parseInt(st.nextToken()); // 색종이 아래쪽 변과 도화지 아래쪽 변 사이 거리

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    paper[j][k] = 1;
                }
            }
        }

        // 넓이 계산
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                sum += paper[i][j];
            }
        }

        System.out.println(sum);

        br.close();
    }
}
