import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        StringBuilder sbA = new StringBuilder(a);
        StringBuilder sbB = new StringBuilder(b);
        int reverseA = Integer.parseInt(sbA.reverse().toString());
        int reverseB = Integer.parseInt(sbB.reverse().toString());

        int max = Math.max(reverseA, reverseB);

        System.out.println(max);

    }
}