import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String[] strArr = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.sort(strArr, ((o1, o2) -> (o2 + o1).compareTo(o1 + o2)));

        if (strArr[0].equals("0")) {
            return "0";
        }

        return String.join("", strArr);
    }
}