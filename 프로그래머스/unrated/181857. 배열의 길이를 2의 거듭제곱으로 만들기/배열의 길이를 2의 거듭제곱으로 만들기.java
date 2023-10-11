import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            list.add(arr[i]);
        }
        int n = 1;
        while(list.size() > n){
            n *= 2;
        }
        System.out.println(n);
        int a = list.size();
        for(int i = 0;i<n-a;i++){
            list.add(0);
        }
        System.out.println(list.size());
        int[] answer = new int[list.size()];
        for(int i = 0;i<list.size();i++) {
            answer[i] = list.get(i);
        }        
       
        return answer;
    }
}