import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int max = 1;
        int count = 1;

        while (true) {
            max = max + 6 * (count - 1);
            if (n <= max) {
                break;
            } else {
                count++;
            }
        }

        System.out.println(count);
        br.close();
    }
}
