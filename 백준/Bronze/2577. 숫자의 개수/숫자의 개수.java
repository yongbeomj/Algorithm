import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String multi = String.valueOf(a * b * c);
        int[] arr = new int[10];

        for (int i = 0; i < multi.length(); i++) {
            int idx = multi.charAt(i) - '0';
            arr[idx]++;
        }
        
        for (int i = 0; i < arr.length; i++) {
            bw.write(String.valueOf(arr[i]));
            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
