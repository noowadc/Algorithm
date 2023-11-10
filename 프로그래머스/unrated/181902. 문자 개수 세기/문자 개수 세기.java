class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(int i = 0;i<my_string.length();i++){
            if((byte)my_string.charAt(i)>=65 && (byte)my_string.charAt(i)<=90){
                answer[((byte)my_string.charAt(i)) - 65]++;
            }
            else answer[((byte)my_string.charAt(i)) - 71]++;
            
        }
        return answer;
    }
}