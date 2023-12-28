import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = st.nextToken(); // 값
        int b = Integer.parseInt(st.nextToken()); // 몇 진법
        int tmp = 1; // 자리수
        int answer = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if ('A' <= ch && ch <= 'Z') {
                answer += (ch - 'A' + 10) * tmp; // A가 10부터 이므로 10을 더해줌
            } else {
                answer += (ch - '0') * tmp;
            }

            tmp *= b;
        }

        System.out.println(answer);
        br.close();
    }
}
