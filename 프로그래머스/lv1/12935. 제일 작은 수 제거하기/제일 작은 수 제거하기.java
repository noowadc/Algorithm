import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        
        int min = 1000;
        int minx = 0;
        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++) {
            if(arr[i] < min) {
                min = arr[i];
                minx = i;
            }
        }
        
        for(int i=0;i<arr.length;i++) {
            if(i != minx)
                list.add(arr[i]);
        }
        if(arr.length == 1)list.add(-1);
        int[] answer = new int[list.size()];
        
        for(int i = 0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}