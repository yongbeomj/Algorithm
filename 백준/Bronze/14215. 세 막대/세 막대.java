import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] sticks = new int[3];
        for (int i = 0; i < 3; i++) {
            sticks[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sticks);

        if (sticks[0] + sticks[1] <= sticks[2]) {
            sticks[2] = sticks[0] + sticks[1] - 1;
        }

        System.out.println(sticks[0] + sticks[1] + sticks[2]);
    }
}
