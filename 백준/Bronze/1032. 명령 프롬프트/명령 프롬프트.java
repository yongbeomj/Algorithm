import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] fileNames = new String[n];
        for (int i = 0; i < n; i++) {
            fileNames[i] = br.readLine();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < fileNames[0].length(); i++) {
            boolean isEqual = true;
            char ch = fileNames[0].charAt(i);

            for (int j = 1; j < fileNames.length; j++) {
                if (fileNames[j].charAt(i) != ch) {
                    isEqual = false;
                    break;
                }
            }

            if (isEqual) {
                sb.append(ch);
            } else {
                sb.append("?");
            }
        }
        
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
