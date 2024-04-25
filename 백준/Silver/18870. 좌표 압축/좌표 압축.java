import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        int[] originArr = new int[t];
        int[] sortArr = new int[t];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < t; i++) {
            originArr[i] = sortArr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sortArr);

        HashMap<Integer, Integer> rankMap = new HashMap<>();

        int rank = 0;
        for (int value : sortArr) {
            if (!rankMap.containsKey(value)) {
                rankMap.put(value, rank);
                rank++;
            }
        }

        for (int value : originArr) {
            bw.write(rankMap.get(value) + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
