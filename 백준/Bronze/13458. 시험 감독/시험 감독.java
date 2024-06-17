import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] centers = new int[n];

        // 응시자 수
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            centers[i] = Integer.parseInt(st.nextToken());
        }

        // 감독관 수
        st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken()); // 총감독관
        int c = Integer.parseInt(st.nextToken()); // 부감독관
        long result = n;

        for (int i = 0; i < n; i++) {
            centers[i] -= b;
            if (centers[i] <= 0) continue;
            
            result += centers[i] / c;
            result += centers[i] % c != 0 ? 1 : 0;
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
