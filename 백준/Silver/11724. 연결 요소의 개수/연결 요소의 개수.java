import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        boolean[][] arr = new boolean[N + 1][N + 1];
        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            arr[u][v] = arr[v][u] = true;
        }

        boolean[] visited = new boolean[N + 1];
        int ans = 0;
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(i, N, arr, visited);
                ans++;
            }
        }

        System.out.println(ans);

    }

    static void dfs(int n, int N, boolean[][] arr, boolean[] visited) {
        visited[n] = true;

        for (int i = 1; i <= N; i++) {
            if (!visited[i] && arr[i][n])
                dfs(i, N, arr, visited);
        }
    }
}