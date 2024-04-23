class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        String[] str = my_string.split("");

        for (int i : indices) {
            str[i] = "";
        }

        for (String s : str) {
            sb.append(s);
        }
        
        return sb.toString();
    }
}