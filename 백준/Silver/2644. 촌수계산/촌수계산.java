
import java.util.Scanner;

public class Main {
	static int N, M, A, B, ans;
	static int[][] arr;
	static boolean[] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();
		M = sc.nextInt();
		arr=new int[N+1][N+1];
		visited = new boolean[N+1];
		ans = -1;
		for(int i =0;i<M;i++) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			arr[X][Y] = 1;
			arr[Y][X]=1;
		}
		DFS(A, 0);
		System.out.println(ans);
		
	}
	public static void DFS(int a, int b) {
		visited[a]=true;
		
		if(a==B) {
			ans = b;
		}
		for(int i = 1;i<=N;i++) {
			if(arr[a][i]==1 && !visited[i]) {
				DFS(i, b+1);
			}
		}
	}
}
