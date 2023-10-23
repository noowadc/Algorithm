import java.util.Scanner;

public class Main {

	static int N, M;
	static int[] ans;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();//N까지의 자연수
		M = sc.nextInt();//M개 뽑기
		ans = new int[M];
		
		DFS(1, 0);
	}
	public static void DFS(int a, int depth) {
		if(depth == M) {
			for(int i = 0;i<M;i++) {
				System.out.print(ans[i]+" ");
			}
			System.out.println();
			return;
		}
		for(int i = a;i<=N;i++) {
			ans[depth]=i;
			DFS(i, depth+1);
		}
	}

}
