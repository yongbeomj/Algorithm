class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder(my_string.substring(s, e + 1));
        sb.reverse();

        String start = my_string.substring(0, s);
        String mid = sb.toString();
        String end = my_string.substring(e + 1);
        
        return start + mid + end;
    }
}