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
        for (int j = 0; j < m; j++) {
            st = new StringTokenizer(br.readLine());
            int start_idx = Integer.parseInt(st.nextToken()) - 1; // 시작 바구니
            int end_idx = Integer.parseInt(st.nextToken()) - 1; // 끝 바구니

            while (start_idx < end_idx) {
                int temp = arr[start_idx];
                arr[start_idx] = arr[end_idx];
                arr[end_idx] = temp;
                start_idx++;
                end_idx--;
            }
        }

        // 바구니 출력
        for (int i : arr) {
            bw.write(String.format("%d ", i));
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
