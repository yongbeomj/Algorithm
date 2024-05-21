import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int c = Integer.parseInt(br.readLine());

        for (int i = 0; i < c; i++) {
            String[] scores = br.readLine().split(" ");
            double sum = 0;
            double n = Integer.parseInt(scores[0]);
            for (int j = 1; j <= n; j++) {
                sum += Integer.parseInt(scores[j]);
            }

            double avg = sum / n;
            double count = 0;
            for (int j = 1; j <= n; j++) {
                if (Integer.parseInt(scores[j]) > avg) {
                    count++;
                }
            }

            double result = (count / n) * 100;
            String str = String.format("%.3f", result);
            bw.write(str + "%\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
