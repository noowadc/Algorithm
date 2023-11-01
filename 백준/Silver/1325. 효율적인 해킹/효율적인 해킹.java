import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

	//효율적인 해킹
		static  int N, M, A, B;
		static List<Integer>[] list;
		static boolean[] visited;
		static int[] arr;
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] str = br.readLine().split(" ");
			
			N = Integer.parseInt(str[0]);
			M = Integer.parseInt(str[1]);
			arr = new int[N+1];
			list = new ArrayList[N+1];
			
			int ans = 0;
			for(int i = 1;i<N+1;i++) {//
				list[i] = new ArrayList<Integer>();
			}
			
			for(int i = 0;i<M;i++) {
				String[] st = br.readLine().split(" ");
				A = Integer.parseInt(st[0]);
				B = Integer.parseInt(st[1]);
				list[A].add(B);
			}
			for(int i = 1;i<=N;i++) {
				visited = new boolean[N+1];
				BFS(i);
			}
			for(int i = 1;i<=N;i++) {
				ans = Math.max(arr[i], ans);
			}
			for(int i = 0;i<=N;i++) {
				if(arr[i] == ans) {
					System.out.print(i+" ");
				}
			}
		}
		
		public static void BFS(int a) {
			//큐 하고, a부터 넣고, 아니면 빼고
			Queue<Integer> q = new LinkedList<>();
			q.add(a);
			visited[a] = true;
			
			while(!q.isEmpty()) {
				int tmp = q.poll();
				for(int i : list[tmp]) {
					if(!visited[i]) {
						visited[i] = true;
						arr[i]++;
						q.add(i);
					}
				}
			}
	}
		
	
	
}
