import java.util.*;

class Solution {
    static int[][] arr;
    public int solution(int n, int[][] wires) {
    int answer = n;
        
        arr = new int[n+1][n+1];
        
        
        for(int i = 0;i<wires.length; i++){
            arr[wires[i][0]][wires[i][1]] = 1;
            arr[wires[i][1]][wires[i][0]] = 1;
        }
        
        for(int i = 0;i<wires.length; i++){
            arr[wires[i][0]][wires[i][1]] = 0;
            arr[wires[i][1]][wires[i][0]] = 0;
            
            answer = Math.min(answer, bfs(n, i+1));
            
            arr[wires[i][0]][wires[i][1]] = 1;
            arr[wires[i][1]][wires[i][0]] = 1;
        }

        return answer;
    }
    private int bfs(int n, int start){
        int cnt = 1;
        Queue<Integer>que = new LinkedList<>();
        boolean[] check = new boolean[n+1];
        que.add(start);
        check[start] = true;
        while(!que.isEmpty()){
            int now = que.poll();
            for(int i = 1; i<=n; i++){
                if(arr[now][i]==1 && !check[i]){
                    que.add(i);
                    check[i] = true;
                    cnt++;
                }
            }
        }
        
        return Math.abs(n-2*cnt);
    }
}