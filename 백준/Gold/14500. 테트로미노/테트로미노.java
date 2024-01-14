import java.util.Scanner;

public class Main {
    static int[][] map;
    static boolean[][] visited;
    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};
    static int n,m, max;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        map = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                visited[i][j] = true;//방문처리하고
               dfs(i, j, 1, map[i][j]);//dfs 탐색
                visited[i][j] = false;//다시 방문 풀고
                others(i,j);//예외에 속하는지
            }
        }
        System.out.println(max);
    }

    static void dfs(int i, int j, int cnt, int sum) {
        if (cnt >= 4) {
            max = Math.max(max, sum);
            return;
        }
        for (int d= 0; d< 4; d++) {
            int nr = i + dr[d];
            int nc = j + dc[d];
            if (nr >= n || nc >= m || nr < 0 || nc < 0) continue;
            if (!visited[nr][nc]) {
                visited[nr][nc] = true;
                dfs(nr, nc, cnt+1, sum+map[nr][nc]);
                visited[nr][nc] = false;
            }
        }
    }

    static void others(int i, int j) { //dfs로 탐색이 불가능한 모양 탐색
        if (i+2 < n && j+1 < m)
            max = Math.max(max, map[i][j] + map[i+1][j] + map[i+1][j+1] + map[i+2][j]);
        if (i+2 < n && j > 0)
            max = Math.max(max, map[i][j] + map[i+1][j] + map[i+2][j] + map[i+1][j-1]);
        if (i+1 < n && j+2 < m)
            max = Math.max(max, map[i][j] + map[i][j+1] + map[i][j+2] + map[i+1][j+1]);
        if (i+1 < n && j+1 < m && j > 0)
            max = Math.max(max, map[i][j] + map[i+1][j] + map[i+1][j-1] + map[i+1][j+1]);
    }
}