class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder resultStr = new StringBuilder(my_string);

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];

            StringBuilder sb = new StringBuilder(resultStr.substring(s, e + 1));
            sb.reverse();
            resultStr.replace(s, e + 1, sb.toString());
        }

        return resultStr.toString();
    }
}