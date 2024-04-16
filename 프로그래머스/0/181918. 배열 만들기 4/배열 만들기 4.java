import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length;) {
            if (list.size() == 0) {
                list.add(arr[i]);
                i++;
            } else {
                if (list.get(list.size() - 1) < arr[i]) {
                    list.add(arr[i]);
                    i++;
                } else {
                    list.remove(list.size() - 1);
                }
            }
        }
        
        int[] stk = list.stream().mapToInt(Integer::intValue).toArray();
        
        return stk;
    }
}