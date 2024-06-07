import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int burger = Integer.MAX_VALUE;
        int beverage = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            int price = Integer.parseInt(br.readLine());
            if (burger > price) {
                burger = price;
            }
        }

        for (int i = 0; i < 2; i++) {
            int price = Integer.parseInt(br.readLine());
            if (beverage > price) {
                beverage = price;
            }
        }

        int result = burger + beverage - 50;
        System.out.println(result);
    }
}
