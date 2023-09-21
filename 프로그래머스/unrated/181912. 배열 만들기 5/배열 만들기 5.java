import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<intStrs.length;i++){
            String str = "";
            for(int j = s;j<s+l;j++){
                str+=intStrs[i].charAt(j);
            }
            if(Integer.parseInt(str)>k){
            list.add(Integer.parseInt(str));
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}