class Solution {
    public String solution(String s) {
        String answer = "";
        
        for(int i = 0;i<s.length();i++) {
            if(s.length()%2 == 0){
                if(i == (s.length()/2) - 1||i == (s.length()/2)) answer += s.charAt(i);
            }
            else {
                if(i == (s.length()-1)/2) answer += s.charAt(i);
            }
        }
        
        return answer;
    }
}