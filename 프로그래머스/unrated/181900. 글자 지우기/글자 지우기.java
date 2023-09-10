class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        for(int i = 0;i<my_string.length();i++){
            int cnt = 0;
             for(int j = 0;j<indices.length;j++){
                 if(i != indices[j]){
                     cnt++;
                 }
             }
            if(cnt == indices.length){
                answer += my_string.charAt(i);
             }
            
        }
        return answer;
        
       
    }
}