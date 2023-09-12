import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        
       
        for(int i = 0;i<my_string.length();i++){
            if(my_string.charAt(i) - '0' >= 0 && my_string.charAt(i) - '0'<=9) {
               list.add(my_string.charAt(i)-'0');
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }
}