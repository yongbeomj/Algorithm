import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 9; i++) {
            bw.write(String.format("%d * %d = %d", n, i, n * i));
            bw.newLine();
        }

        bw.flush();
    }
}