import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();

        StringBuffer sbA = new StringBuffer(a);
        int reverseA = Integer.parseInt(sbA.reverse().toString());

        StringBuffer sbB = new StringBuffer(b);
        int reverseB = Integer.parseInt(sbB.reverse().toString());

        int max = Math.max(reverseA, reverseB);

        bw.write(String.valueOf(max));
        br.close();
        bw.flush();
        bw.close();
    }
}
