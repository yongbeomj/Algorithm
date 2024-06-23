import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (queue.size() != 1) {
            for (int i = 0; i < m - 1; i++) {
                queue.offer(queue.poll());
            }

            sb.append(queue.poll() + ", ");
        }

        sb.append(queue.poll() + ">");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
