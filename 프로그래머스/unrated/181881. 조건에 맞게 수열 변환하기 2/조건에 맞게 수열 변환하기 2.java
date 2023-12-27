class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] arr2 = new int[arr.length];
        int a = 0;
        
        while(a != arr.length){
            a = 0;
            answer++;
            for(int i = 0;i<arr.length;i++){
                if(arr[i] >= 50 && arr[i]%2==0) arr2[i] = arr[i]/2;
                else if(arr[i]<50 && arr[i]%2 == 1) arr2[i] = arr[i]*2+1;
                else arr2[i] = arr[i];
            }
            for(int i = 0;i<arr.length;i++){
                if(arr[i] == arr2[i]) 
                    a++;
                    
                
                arr[i] = arr2[i];
            }
        }
        
        answer--;
        return answer;
    }
}