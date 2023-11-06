import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken()); // 입력 정수 총 개수
        int x = Integer.parseInt(st1.nextToken()); // 출력 조건 (x 미만)

        int[] arr = new int[n];
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        String result = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < x) {
                result += arr[i] + " ";
            }
        }

        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }
}