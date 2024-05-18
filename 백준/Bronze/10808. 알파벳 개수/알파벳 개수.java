import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        int[] alphabet = new int[26];

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            alphabet[idx]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int val : alphabet) {
            sb.append(val).append(" ");
        }

        System.out.println(sb);
    }
}
