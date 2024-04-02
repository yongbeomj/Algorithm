import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> strMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            strMap.put(br.readLine(), 0);
        }

        int count = 0;
        for (int j = 0; j < m; j++) {
            if (strMap.get(br.readLine()) != null) {
                count++;
            }
        }
        
        br.close();
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}