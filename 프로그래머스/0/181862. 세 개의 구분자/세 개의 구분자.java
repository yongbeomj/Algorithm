import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        ArrayList<String> list = new ArrayList<>();
        String[] splitStr = myStr.split("a|b|c");

        for (String str : splitStr) {
            if (!str.isEmpty()) {
                list.add(str);
            }
        }

        if (list.isEmpty()) {
            return new String[]{"EMPTY"};
        } else {
            return list.toArray(new String[0]);
        }
    }
}