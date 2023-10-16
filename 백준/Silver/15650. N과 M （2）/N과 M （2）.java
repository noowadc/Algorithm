import java.util.Scanner;

public class Main {


	public static int[] arr;
	public static int N, M;
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		N = in.nextInt();
		M = in.nextInt();
 
		arr = new int[M];
        
		dfs(1, 0);
 
	}
 
	public static void dfs(int a, int depth) {
 
		if (depth == M) {
			for (int i = 0;i<M;i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
        
		for (int i = a; i <= N; i++) {
 
			arr[depth] = i;
			dfs(i + 1, depth + 1);
 
		}
	}
}
