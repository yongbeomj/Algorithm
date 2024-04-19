import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 바구니 개수
        int m = Integer.parseInt(st.nextToken()); // 공 넣는 횟수

        int[] basket = new int[n];
        for (int p = 0; p < m; p++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            for (int q = i - 1; q < j; q++) {
                basket[q] = k;
            }
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append(basket[i] + " ");
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}