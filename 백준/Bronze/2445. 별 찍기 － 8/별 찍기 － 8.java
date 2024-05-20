import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i < n; i++) {
            String star = "*".repeat(i);
            String gap = " ".repeat((n - i) * 2);
            bw.write(star + gap + star);
            bw.newLine();
        }

        for (int i = n; i >= 1; i--) {
            String star = "*".repeat(i);
            String gap = " ".repeat((n - i) * 2);
            bw.write(star + gap + star);
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
