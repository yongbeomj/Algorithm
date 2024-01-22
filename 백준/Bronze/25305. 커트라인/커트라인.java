import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 응시자 수
        int k = Integer.parseInt(st.nextToken()); // 상 수여자 수

        // 응시자 수 점수 입력
        st = new StringTokenizer(br.readLine());
        Integer[] score = new Integer[n];
        for (int i = 0; i < n; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }

        br.close();

        Arrays.sort(score, Collections.reverseOrder());

        bw.write(String.valueOf(score[k-1]));
        bw.flush();
        bw.close();
    }
}
