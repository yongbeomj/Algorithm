import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] names = br.readLine().split("-");
        for (String name : names) {
            bw.write(name.charAt(0));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
