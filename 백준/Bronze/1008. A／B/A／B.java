import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.#########");

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        double result = (double) A / B;

        System.out.println(df.format(result));
    }
}