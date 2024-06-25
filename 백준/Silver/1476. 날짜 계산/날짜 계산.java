import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int e = 1, s = 1, m = 1;
        int year = 1;

        while (true) {
            if (e == E && s == S && m == M) {
                break;
            }

            year++;
            e++;
            if (e > 15) {
                e = 1;
            }
            s++;
            if (s > 28) {
                s = 1;
            }
            m++;
            if (m > 19) {
                m = 1;
            }
        }

        bw.write(year + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
