class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        for(int i = 0;i<queries.length;i++) {

                int n = queries[i][0];
                while(n<=queries[i][1]){
                    arr[n]++;
                    n++;
                }
            
        }
        for(int i = 0;i<arr.length;i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}