
import java.util.Scanner;

public class Main {
	
	static int N,M;
	static int[] nums;
	static int[] arr;
	static boolean[] visited;
	
	static void permutation(int idx) {
		
		if(idx == M) {
			for(int i : arr) {
				System.out.print(i + " ");
			}
			System.out.println();
			
			return;
		}

		for(int i = 0; i < N; i++) {
			if(visited[i]) continue;
			visited[i] = true;
			arr[idx] = nums[i];
			permutation(idx+1);
			visited[i] = false;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		nums = new int[N];
		arr = new int[M];
		visited = new boolean[N];
		
		for(int i = 0; i < N; i++) {
			nums[i] = i+1;
		}
		permutation(0);
	}
	
}