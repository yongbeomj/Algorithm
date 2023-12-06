import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        int[] sumArr = new int[t];

        for (int i = 0; i < t; i++) {
            String strOX = br.readLine();
            int sum = 0;
            int score = 0;
            int ch = 'O';

            for (int j = 0; j < strOX.length(); j++) {
                score = (ch == strOX.charAt(j)) ? score + 1 : 0;
                sum += score;
            }
            sumArr[i] = sum;
        }

        for (int arr : sumArr) {
            bw.write(String.valueOf(arr));
            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
