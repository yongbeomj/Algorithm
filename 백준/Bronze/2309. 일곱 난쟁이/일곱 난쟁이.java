import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] heights = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            heights[i] = Integer.parseInt(br.readLine());
            sum += heights[i];
        }
        
        loop:
        for (int i = 0; i < heights.length - 1; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                if (sum - heights[i] - heights[j] == 100) {
                    heights[i] = heights[j] = 0;
                    break loop;
                }
            }
        }

        Arrays.sort(heights);
        for (int i = 2; i < 9; i++) {
            bw.write(heights[i] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
