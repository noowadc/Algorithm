class Solution {
    public int solution(int n) {
        int answer = 0;
        int fact = 1;
        
        for(int i=1; i<=10; i++){
            fact *= i;
            
            if(fact == n){
                answer = i;
                break;
            }else if(n < fact){
                answer = (i-1);
                break;
            }
        }
        return answer;
    }
}