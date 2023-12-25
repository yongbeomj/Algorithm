import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[][] ch = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String str = br.readLine(); // 입력
            for (int j = 0; j < str.length(); j++) {
                ch[i][j] = str.charAt(j); // 배열에 저장
            }
        }

        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if (ch[i][j] == 0) {
                    continue;
                } else {
                    bw.write(String.valueOf(ch[i][j]));
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
