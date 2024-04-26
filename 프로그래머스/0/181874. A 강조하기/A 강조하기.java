class Solution {
    public String solution(String myString) {
        char[] arr = myString.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'A') {
                continue;
            }

            arr[i] = arr[i] == 'a' ? arr[i] = 'A' : Character.toLowerCase(arr[i]);
        }

        return String.valueOf(arr);
    }
}