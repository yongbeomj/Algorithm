import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] result = new int[6];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            int input = Integer.parseInt(st.nextToken());
            result[i] = chess[i] - input;
        }

        for (int i : result) {
            bw.write(String.valueOf(i));
            bw.write(" ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}