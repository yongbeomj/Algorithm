import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine().toUpperCase(); // 입력값 대문자로 치환
        int[] arr = new int[26];

        // 알파벳 사용 개수 체크 (배열에 저장)
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            arr[ch - 'A']++;
        }

        int max = -1;
        char maxCh = '?';

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxCh = (char) (i + 65);
            } else if (arr[i] == max) {
                maxCh = '?';
            }
        }

        bw.write(String.valueOf(maxCh));
        br.close();
        bw.flush();
        bw.close();
    }
}
