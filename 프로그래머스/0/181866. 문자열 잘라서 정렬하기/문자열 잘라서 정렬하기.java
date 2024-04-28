import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] splitArr = myString.split("x");
        ArrayList<String> list = new ArrayList<>();

        for (String str : splitArr) {
            if (!str.isEmpty()) {
                list.add(str);
            }
        }

        String[] answer = list.toArray(new String[list.size()]);
        Arrays.sort(answer);
        
        return answer;
    }
}