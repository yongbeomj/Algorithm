import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        Arrays.sort(spell);
        String word = String.join("", spell);

        for (String str : dic) {
            String[] arr =str.split("");
            Arrays.sort(arr);

            String dicWord = String.join("",arr);
            if (dicWord.contains(word)) {
                return 1;
            }
        }

        return 2;
    }
}