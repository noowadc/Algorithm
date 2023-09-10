class Solution {
    public int solution(int[] numbers) {
        int answer = -100000000;
        int gop = 1;
        
        for(int i = 0;i<numbers.length;i++){
            for(int k = 1;k<numbers.length;k++){
                if(i+k<numbers.length ){
                    gop = numbers[i] * numbers[i+k];
                    if(answer < gop) answer = gop;
                }
            }
           
        }
        return answer;
    }
}