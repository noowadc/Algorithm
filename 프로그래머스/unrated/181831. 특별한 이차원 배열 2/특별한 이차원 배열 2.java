class Solution {
    public int solution(int[][] arr) {
        int n = arr.length;
        int answer = 0;
        int cnt = 0;
        
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                
                    if(arr[i][j] == arr[j][i]) {
                        cnt++;
                    }
                
                    
            }
        }
        if(cnt == n*n) answer = 1;
        else answer = 0;
        return answer;
    }
}