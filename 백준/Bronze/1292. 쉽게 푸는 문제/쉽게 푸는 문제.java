import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int count = 0;
        int sum = 0;

        loop:
        for (int i = 1; i <= 1000; i++) {
            for (int j = 0; j < i; j++) {
                count++;
                if (count >= a && count <= b) {
                    sum += i;
                } else if (count > b) {
                    break loop;
                }
            }
        }

        br.close();
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
