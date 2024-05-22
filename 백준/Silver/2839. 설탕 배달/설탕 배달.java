import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int basket = 0;

        while (n > 0) {
            if (n % 5 == 0) {
                basket += n / 5;
                n %= 5;
            } else {
                basket++;
                n -= 3;
            }

            if (n < 0) {
                basket = -1;
                break;
            }
        }

        br.close();
        bw.write(String.valueOf(basket));
        bw.flush();
        bw.close();
    }
}
