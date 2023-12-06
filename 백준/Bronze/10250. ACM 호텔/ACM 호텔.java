import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine()); // 테스트 데이터 개수
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken()); // 호텔의 층 수
            int w = Integer.parseInt(st.nextToken()); // 각 층의 방 수
            int n = Integer.parseInt(st.nextToken()); // N번째 손님

            if (n % h == 0) { // 최고층 (0층은 없으므로)
                sb.append((h * 100) + (n / h)).append("\n");
            } else {
                sb.append(((n % h) * 100) + ((n / h) + 1)).append("\n");
            }
        }

        bw.write(String.valueOf(sb));
        br.close();
        bw.flush();
        bw.close();
    }
}
