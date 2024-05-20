import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = n; i > 1; i--) {
            String stars = "*".repeat(2 * i - 1);
            String gap = " ".repeat(n - i);
            sb.append(gap).append(stars).append("\n");
        }

        for (int i = 1; i <= n; i++) {
            String stars = "*".repeat(2 * i - 1);
            String gap = " ".repeat(n - i);
            sb.append(gap).append(stars).append("\n");
        }

        System.out.println(sb);
    }
}
