import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[][] scores = new String[n][4];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                scores[i][j] = st.nextToken();
            }
        }

        Arrays.sort(scores, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if (o1[1].equals(o2[1])) { // 국어
                    if (o1[2].equals(o2[2])) { // 영어
                        if (o1[3].equals(o2[3])) { // 수학
                            return o1[0].compareTo(o2[0]);
                        }
                        return Integer.parseInt(o2[3]) - Integer.parseInt(o1[3]);
                    }
                    return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
                }
                return Integer.parseInt(o2[1]) - Integer.parseInt(o1[1]);
            }
        });

        for (String[] score : scores) {
            bw.write(score[0] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
