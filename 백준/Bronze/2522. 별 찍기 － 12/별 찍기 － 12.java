import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < n; i++) {
            String star = "*".repeat(i);
            String gap = " ".repeat(n-i);

            sb.append(gap).append(star).append("\n");
        }

        for (int i = n; i >= 1; i--) {
            String star = "*".repeat(i);
            String gap = " ".repeat(n-i);

            sb.append(gap).append(star).append("\n");
        }

        System.out.println(sb);
    }
}
