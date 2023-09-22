class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 100;
        for(int i = 0;i<array.length;i++) {
           if(array[i]>=n) {
               if(min > array[i]-n) {
                   min = array[i]-n;
                   answer = array[i];
               }
               else if(min == array[i]-n) answer = Math.min(answer, array[i]);
           }
            else {
                if(min > n - array[i]){
                    min = n - array[i];
                    answer = array[i];
                }
                else if(min == n - array[i]) answer = Math.min(answer, array[i]);
            }
            
        }
        
        return answer;
    }
}