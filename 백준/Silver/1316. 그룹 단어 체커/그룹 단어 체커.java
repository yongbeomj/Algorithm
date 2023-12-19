import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int groupCount = 0;

        for (int i = 0; i < n; i++) {
            if (checkStr(br.readLine())) {
                groupCount++;
            }
        }
        
        br.close();
        System.out.println(groupCount);
    }

    public static boolean checkStr(String str) {
        boolean[] arr = new boolean[26];
        int prev = -1;

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);

            if (now != prev) { // 현재 문자와 이전 문자가 다를 경우
                if (arr[now - 'a'] == false) { // 현재 문자가 처음 나오는 경우
                    arr[now - 'a'] = true;
                    prev = now;
                } else { // 현재 문자가 나온 적이 있는 경우
                    return false; // 종료 (그룹 단어 아님)
                }
            }
        }

        return true;
    }
}
