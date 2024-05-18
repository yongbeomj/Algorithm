import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int m = 0;
        for (int i = 1; i <= n; i++) {
            int number = i;
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }

            if (i + sum == n) {
                m = i;
                break;
            }
        }

        br.close();
        bw.write(String.valueOf(m));
        bw.flush();
        bw.close();
    }
}
