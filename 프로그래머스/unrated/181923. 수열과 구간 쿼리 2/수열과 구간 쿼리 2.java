import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer, Integer.MAX_VALUE);
       for(int i = 0; i < queries.length; i++) { // 쿼리의 길이만큼 반복
            for (int j = queries[i][0]; j <= queries[i][1]; j++){ 
            // 각 쿼리의 s <= i <= e의 조건을 for문을 이용해 충족
                if( arr[j] > queries[i][2]) { // i > k의 조건
                    if(answer[i] > arr[j]) // 가장 작은 arr[i] 조건
                        answer[i] = arr[j];
                }
            }
            if(answer[i] == Integer.MAX_VALUE)
                answer[i] = -1;
        }
        return answer;
    }
}