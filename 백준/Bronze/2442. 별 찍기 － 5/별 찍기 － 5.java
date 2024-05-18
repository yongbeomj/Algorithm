import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= n; i++) {
            String stars = "*".repeat(2 * i - 1);
            String gap = " ".repeat(n - i);
            sb.append(gap).append(stars).append("\n");
        }

        System.out.println(sb);
    }
}
