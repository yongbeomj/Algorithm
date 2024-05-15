import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            if (str.equals("#")) {
                break;
            }

            str = str.replaceAll("[^aeiouAEIOU]", "");
            System.out.println(str.length());
        }
        br.close();
    }
}
