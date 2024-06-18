import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] sides = new int[3];

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 3; i++) {
                sides[i] = Integer.parseInt(st.nextToken());
            }

            if (sides[0] == 0 && sides[1] == 0 && sides[2] == 0) {
                break;
            }

            Arrays.sort(sides);

            if (sides[0] + sides[1] <= sides[2]) {
                bw.write("Invalid" + "\n");
                continue;
            }

            if (sides[0] == sides[1] && sides[0] == sides[2]) {
                bw.write("Equilateral" + "\n");
            } else if (sides[0] != sides[1] && sides[0] != sides[2] && sides[1] != sides[2]) {
                bw.write("Scalene" + "\n");
            } else {
                bw.write("Isosceles" + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
