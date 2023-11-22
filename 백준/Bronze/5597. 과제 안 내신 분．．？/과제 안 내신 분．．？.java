import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] arr = new boolean[30];

        // 제출자 체크
        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine()); // 출석번호
            arr[n-1] = true;
        }

        // 미제출자 확인
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != true) {
                bw.write(String.format("%d\n", j+1));
            }
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}