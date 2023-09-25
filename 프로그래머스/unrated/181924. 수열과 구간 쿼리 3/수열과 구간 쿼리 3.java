class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        int tmp = 0;
        for(int i = 0;i<queries.length;i++) {
                tmp = arr[queries[i][0]];
                arr[queries[i][0]] = arr[queries[i][1]];
                arr[queries[i][1]] = tmp;
        }
        for(int i = 0;i<arr.length;i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}