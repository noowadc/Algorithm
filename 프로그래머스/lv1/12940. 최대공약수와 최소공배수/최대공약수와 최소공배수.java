class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        boolean a = false;
        for(int i = 1;i<=n;i++) {
            if(n % i == 0 && m % i == 0) answer[0] = i;
        }
        
        
        for(int b = m;b<1000000;b++){
            if(b % n == 0 && b % m == 0) {
                answer[1] = b;
                break;
            }
        }
            
        
        return answer;
    }
}