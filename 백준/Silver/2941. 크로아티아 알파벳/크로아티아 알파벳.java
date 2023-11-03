import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        // 크로아티아 알파벳
        String crtAlp[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < crtAlp.length; i++) {
            if (word.contains(crtAlp[i])) { // 입력 단어에 크로아티아 알파벳이 포함되어 있으면
                word = word.replace(crtAlp[i], "a"); // "a" 로 치환 (1글자로 세기 위함)
            }
        }
        
        System.out.println(word.length()); // 최종 단어 길이 세기
    }
}