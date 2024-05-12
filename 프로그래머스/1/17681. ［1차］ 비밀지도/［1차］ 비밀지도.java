class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] strArr1 = new String[arr1.length];
        String[] strArr2 = new String[arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            String str1 = Integer.toBinaryString(arr1[i]);
            strArr1[i] = "0".repeat(n - str1.length()) + str1;

            String str2 = Integer.toBinaryString(arr2[i]);
            strArr2[i] = "0".repeat(n - str2.length()) + str2;
        }

        String[] answer = new String[arr1.length];

        for (int i = 0; i < strArr1.length; i++) {
            String strMap = "";
            for (int j = 0; j < n; j++) {
                if (strArr1[i].charAt(j) == '0' && strArr2[i].charAt(j) == '0') {
                    strMap += " ";
                } else {
                    strMap += "#";
                }
            }

            answer[i] = strMap;
        }

        return answer;
    }
}