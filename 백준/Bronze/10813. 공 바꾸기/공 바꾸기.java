import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 바구니 개수
        int m = Integer.parseInt(st.nextToken()); // 공 교환 횟수

        // 초기 바구니 세팅
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        // 공 교환
        int temp;
        for (int j = 0; j < m; j++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            temp = arr[a - 1];
            arr[a - 1] = arr[b - 1];
            arr[b - 1] = temp;
        }

        // 바구니에 들어있는 공 번호 출력
        for (int k = 0; k < arr.length; k++) {
            bw.write(String.format("%d ", arr[k]));
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}