import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result = fibo(n);
        System.out.println(result);
    }

    static int fibo(int n) {
        return n < 2 ? n : fibo(n - 1) + fibo(n - 2);
    }
}
