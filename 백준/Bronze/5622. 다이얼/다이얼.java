import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        char[] arr = {'C', 'F', 'I', 'L', 'O', 'S', 'V', 'Z'};
        int idx = 0;

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= word.charAt(i)) {
                    idx += j + 3;
                    break;
                }
            }
        }

        System.out.println(idx);
    }
}
