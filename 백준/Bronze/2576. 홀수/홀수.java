import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int min = -1;

        for (int i = 0; i < 7; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num % 2 == 1) {
                sum += num;
                min = min == -1 ? num : Math.min(min, num);
            }
        }

        if (sum == 0) {
            System.out.println(-1);
            return;
        }
        
        System.out.println(sum);
        System.out.println(min);
    }
}
