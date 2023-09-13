import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String str = my_string.toLowerCase();
        char[] arr = new char[str.length()];
        
        for(int i = 0;i<str.length();i++){
            arr[i] = str.charAt(i);
        }
        Arrays.sort(arr);
        
        for(int i = 0;i<arr.length;i++){
            answer += arr[i];
        }
        return answer;
    }
}