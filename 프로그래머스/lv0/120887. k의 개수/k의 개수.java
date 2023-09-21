class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String num = "";
       
        for(int n = i;n<=j;n++){
            num = Integer.toString(n);
            for(int n2 = 0;n2<num.length();n2++){
                if(num.charAt(n2) == (Integer.toString(k)).charAt(0)) answer++;
            }
        }
        
        return answer;
    }
}