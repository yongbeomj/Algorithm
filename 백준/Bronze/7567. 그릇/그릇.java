import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int height = 10;

        for (int i = 1; i < str.length(); i++) {
            height += str.charAt(i - 1) == str.charAt(i) ? 5 : 10;
        }

        System.out.println(height);
    }
}
