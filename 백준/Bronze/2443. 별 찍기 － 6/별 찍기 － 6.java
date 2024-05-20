import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = n; i >= 1; i--) {
            String stars = "*".repeat(2 * i - 1);
            String gap = " ".repeat(n - i);
            bw.write(gap + stars);
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
