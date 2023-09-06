class Solution {
    public String solution(String my_string) {
    String answer = "";
    int cnt = 0;
    
        answer+= my_string.charAt(0);
    for(int i = 1;i<my_string.length();i++){
        cnt = 0;
        for(int k = my_string.length()-1;k>=0;k--){
            if(i-k>=0){
                if( my_string.charAt(i) != my_string.charAt(i-k)) cnt++;
            }
        }
        if(cnt == i) answer+= my_string.charAt(i);
    }
        
        return answer;
    }
}