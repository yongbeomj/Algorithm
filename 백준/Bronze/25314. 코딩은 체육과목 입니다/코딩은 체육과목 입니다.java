import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int longCount = N / 4; // long 개수
        String dataType = "int";

        for (int i = 0; i < longCount; i++) {
            dataType = "long " + dataType;
        }

        System.out.println(dataType);
    }
}