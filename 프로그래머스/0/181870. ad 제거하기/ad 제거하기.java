import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> strList = new ArrayList<>();
        for (String str : strArr) {
            if (!str.contains("ad")) {
                strList.add(str);
            }
        }
        
        return strList.stream().toArray(String[]::new);
    }
}