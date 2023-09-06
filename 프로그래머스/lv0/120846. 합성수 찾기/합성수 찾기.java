class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        
        for(int j = 4;j<=n;j++){
            cnt = 0;
            for(int i = 2;i<=n;i++){
                if(j>=i){
                    if(j % i == 0) cnt++;
                }
            }
            if(cnt >= 2) answer++; 
        }
        
        return answer;
    }
}