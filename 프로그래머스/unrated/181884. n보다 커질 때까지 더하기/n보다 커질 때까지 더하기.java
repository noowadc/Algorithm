class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int tmp = 0;
        
        for(int i = 0;i<numbers.length;i++){
	            if(answer<=n){
	                answer += numbers[i];
	                tmp = i;
	            }
	            else break;
	        }
       
        
        return answer;
    }
}