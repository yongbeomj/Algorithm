import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine()); // 테스트케이스 개수

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken()); // 반복횟수
            String s = st.nextToken(); // 문자열

            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < r; k++) {
                    bw.write(s.charAt(j));
                }
            }
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}