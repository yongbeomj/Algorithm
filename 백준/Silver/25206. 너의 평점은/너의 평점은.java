import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double scoreSum = 0; // 학점 총합
        double totalSum = 0; // 전공과목 총합

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String subject = st.nextToken(); // 과목
            double score = Double.parseDouble(st.nextToken()); // 학점
            String gradeStr = st.nextToken(); // 등급

            if (!gradeStr.equals("P")) {
                double gradeNum = convertGrade(gradeStr); // 과목평점 변환
                scoreSum += score;
                totalSum += score * gradeNum;
            }
        }

        br.close();
        System.out.printf("%.6f\n", totalSum / scoreSum);
    }

    public static double convertGrade(String grade) {
        String[] grades = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        double[] gradeValues = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};
        double result = 0.0;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i].equals(grade)) {
                result = gradeValues[i];
                break;
            }
        }

        return result;
    }
}
