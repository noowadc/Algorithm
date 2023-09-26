import java.util.*;
class Solution {
    public String[] solution(String myStr) {

        List<String> list = new ArrayList<>();
        String[] answer = myStr.split("[a|b|c]");
        for(int i = 0;i<answer.length;i++) {
            if(!answer[i].equals(""))
                list.add(answer[i]);
        }
        
        if (list.size() == 0) {
            answer = new String[1];
            answer[0] = "EMPTY";
        } else {
            answer = new String[list.size()];
            for(int i = 0;i<list.size();i++){
                answer[i] = list.get(i);
            }
        }
        
        return answer;
    }
}