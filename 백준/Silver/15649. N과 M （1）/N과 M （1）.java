import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int n, m;
    static boolean[] visit;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        br.close();

        visit = new boolean[n];
        arr = new int[m];
        dfs(0); // 탐색 start

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }

    public static void dfs(int depth) {
        if (depth == m) {
            for (int val : arr) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visit[i]) { // 방문하지 않았다면
                visit[i] = true; // 방문 상태로 변경
                arr[depth] = i + 1;
                dfs(depth + 1); // 자식 노드 탐색
                visit[i] = false;
            }
        }
    }
}
