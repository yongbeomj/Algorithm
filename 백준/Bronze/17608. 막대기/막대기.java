import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            int h = Integer.parseInt(br.readLine());
            stack.push(h);
        }

        int count = 1;
        int maxStick = stack.pop();

        for (int i = 1; i < n; i++) {
            int stick = stack.pop();
            if (stick > maxStick) {
                count++;
                maxStick = stick;
            }
        }

        System.out.println(count);
    }
}
