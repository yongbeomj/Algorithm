import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            String result = chkVps(br.readLine());
            sb.append(result).append("\n");
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static String chkVps(String vps) {
        int chk = 0;
        for (int i = 0; i < vps.length(); i++) {
            if (vps.charAt(i) == '(') {
                chk++;
            } else {
                chk--;

                if (chk < 0) {
                    return "NO";
                }
            }
        }

        return chk == 0 ? "YES" : "NO";
    }
}
