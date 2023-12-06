import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numArr = new int[8];

        for (int i = 0; i < 8; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        String result = "";

        for (int i = 0; i < 7; i++) {
            if (numArr[i+1] - numArr[i] == 1) {
                result = "ascending";
            } else if (numArr[i+1] - numArr[i] == -1) {
                result = "descending";
            } else {
                result = "mixed";
                break;
            }
        }
        
        bw.write(result);
        br.close();
        bw.flush();
        bw.close();
    }
}
