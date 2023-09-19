import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        int cnt = 0;
        
        char[] arr = before.toCharArray();
        char[] arr2 = after.toCharArray();;
        

        
        Arrays.sort(arr);
        Arrays.sort(arr2);
        
        
        for(int i = 0;i<before.length();i++){
            if(arr[i] == arr2[i]) cnt++;
        }
        if(cnt == before.length()) answer = 1;
        
        return answer;
    }
}