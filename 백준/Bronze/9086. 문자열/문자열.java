import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine()); // test case 개수
        String[] arr = new String[t];

        for (int i = 0; i < t; i++) {
            String word = br.readLine();
            arr[i] = String.valueOf(word.charAt(0));
            arr[i] += String.valueOf(word.charAt(word.length()-1));
        }

        for (String s : arr) {
            bw.write(s);
            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
