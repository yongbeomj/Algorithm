import java.io.*;
import java.util.*;

public class Main {
    static List<Integer> queue = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    queue.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    int isEmpty = queue.isEmpty() ? 1 : 0;
                    sb.append(isEmpty).append("\n");
                    break;
                case "front":
                    sb.append(front()).append("\n");
                    break;
                case "back":
                    sb.append(back()).append("\n");
                    break;
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    public static int pop() {
        if (queue.isEmpty()) {
            return -1;
        }

        return queue.remove(0);
    }

    public static int front() {
        if (queue.isEmpty()) {
            return -1;
        }

        return queue.get(0);
    }

    public static int back() {
        if (queue.isEmpty()) {
            return -1;
        }

        return queue.get(queue.size() - 1);
    }
}
