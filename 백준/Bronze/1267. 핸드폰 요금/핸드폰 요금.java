import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] times = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            times[i] = Integer.parseInt(st.nextToken());
        }

        int yFee = 0;
        int mFee = 0;

        for (int i = 0; i < n; i++) {
            yFee += ((times[i] / 30) + 1) * 10;
            mFee += ((times[i] / 60) + 1) * 15;
        }

        if (yFee == mFee) {
            bw.write("Y M " + yFee);
        } else if (yFee > mFee) {
            bw.write("M " + mFee);
        } else {
            bw.write("Y " + yFee);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
