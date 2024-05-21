import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;

        for (int i = 0; i < 8; i++) {
            String chess = br.readLine();
            int start = i % 2 == 0 ? 0 : 1;

            for (int j = start; j < chess.length(); j += 2) {
                if (chess.charAt(j) == 'F') {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
