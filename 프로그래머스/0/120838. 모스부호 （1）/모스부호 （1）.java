class Solution {
    public String solution(String letter) {
        String[] morseArr = {
                ".-", "-...", "-.-.", "-..", ".", "..-.",
                "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--.."};

        String[] strArr = letter.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String str : strArr) {
            for (int i = 0; i < morseArr.length; i++) {
                if (str.equals(morseArr[i])) {
                    sb.append(Character.toString(i + 'a'));
                }
            }
        }

        return sb.toString();
    }
}