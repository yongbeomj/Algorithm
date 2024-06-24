import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            map.put(name.charAt(0), map.getOrDefault(name.charAt(0), 0) + 1);
        }

        List<Character> list = new ArrayList<>();

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 5) {
                list.add(entry.getKey());
            }
        }

        StringBuilder sb = new StringBuilder();

        if (list.isEmpty()) {
            sb.append("PREDAJA");
        } else {
            Collections.sort(list);
            for (char ch : list) {
                sb.append(ch);
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
