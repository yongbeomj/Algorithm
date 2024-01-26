import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        int n = Integer.parseInt(br.readLine());
        char ch = word.charAt(n - 1);

        bw.write(ch);
        bw.flush();
        bw.close();
    }
}