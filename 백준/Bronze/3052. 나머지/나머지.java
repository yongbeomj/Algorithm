import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<Integer> hashSet = new HashSet<>();

        // 10개 숫자 입력
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine()); // 출석번호
            hashSet.add(num % 42);
        }

        // 중복 제거된 숫자 개수
        bw.write(String.valueOf(hashSet.size()));
        br.close();
        bw.flush();
        bw.close();
    }
}