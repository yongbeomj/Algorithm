import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < word.length(); i += 10) {
            String subWord = i + 10 <= word.length() ? word.substring(i, i + 10) : word.substring(i);
            sb.append(subWord).append("\n");
        }
        
        System.out.println(sb);
    }
}
