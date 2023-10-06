import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = new String[(s.length()+1)/2];
        arr = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0;i<arr.length;i++){
            int a = Integer.parseInt(arr[i]);
            min = Math.min(min, a);
            max = Math.max(max, a);
        }
        answer = min + " " + max;
        
        return answer;
        
    }
}