class Solution {
    public int solution(int[] num_list) {
        int multi = 1;
        int plus = 0;

        for (int i = 0; i < num_list.length; i++) {
            multi *= num_list[i];
            plus += num_list[i];
        }
        
        if (Math.pow(plus, 2) > multi) {
            return 1;
        } else {
            return 0;
        }
    }
}