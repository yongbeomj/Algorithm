import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 과목 개수
        double[] scoreArr = new double[n];

        // 점수 입력
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < scoreArr.length; i++) {
            scoreArr[i] = Double.parseDouble(st.nextToken());
        }

        // 정렬 (최대값 구하기)
        Arrays.sort(scoreArr);

        // 점수 계산
        for (int j = 0; j < scoreArr.length; j++) {
            scoreArr[j] = (scoreArr[j] / scoreArr[scoreArr.length - 1]) * 100;
        }

        // 평균 계산
        double scoreAvg = Arrays.stream(scoreArr).average().orElse(0);

        bw.write(String.valueOf(scoreAvg));
        br.close();
        bw.flush();
        bw.close();
    }
}
