import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int days = 0;
        if (a > v) {
            days = 1;
        } else {
            days = (v - b) / (a - b);
            if ((v - b) % (a - b) != 0) {
                days++;
            }
        }

        bw.write(String.valueOf(days));
        bw.close();
    }
}
