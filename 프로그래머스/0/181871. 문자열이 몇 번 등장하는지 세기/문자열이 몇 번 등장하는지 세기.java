class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int cnt = 0;
        
        for(int i = 0;i<myString.length()-pat.length()+1;i++){
            String str = "";
            for(int j = 0;j<pat.length();j++){  
                str += myString.charAt(i+j);
            }
            if(str.contains(pat)) answer++;
        }
        
        return answer;
    }
}