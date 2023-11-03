import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int h = a + (c / 60);
        int m = b + (c % 60);
        h += m / 60;
        m = m % 60;

        if (h > 23) {
            System.out.println((h - 24) + " " + m);
        } else {
            System.out.println(h + " " + m);
        }
    }
}