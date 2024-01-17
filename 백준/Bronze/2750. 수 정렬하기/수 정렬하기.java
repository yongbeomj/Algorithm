import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] numArr = new int[n];

        for (int i = 0; i < n; i++) {
            numArr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numArr);

        for (int i = 0; i < n; i++) {
            bw.write(String.valueOf(numArr[i]));
            bw.newLine();
        }

        bw.flush();
    }
}