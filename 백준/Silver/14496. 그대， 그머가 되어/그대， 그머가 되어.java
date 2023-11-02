import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main{

		static int a, b, N, M, c, d, cnt, ans;
		static List<Integer>[] list;
		static boolean[] visited;
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			StringTokenizer st = new StringTokenizer(br.readLine());//치환해야 할 문자
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			StringTokenizer str = new StringTokenizer(br.readLine());//전체 문자 수와 치환 가능한 문자쌍의 수
			N = Integer.parseInt(str.nextToken());
			M = Integer.parseInt(str.nextToken());
			list = new ArrayList[N+1];
			
			for(int i = 1;i<N+1;i++) {
				list[i] = new ArrayList<Integer>();
			}
			
			visited = new boolean[N+1];
			
			for(int i = 0;i<M;i++) {//치환 가능한 문자쌍
				StringTokenizer s = new StringTokenizer(br.readLine());
				c = Integer.parseInt(s.nextToken());
				d = Integer.parseInt(s.nextToken());
				list[c].add(d);
				list[d].add(c);
			}
			ans = BFS(a);
			
            System.out.println(ans);
			
		}
		public static int BFS(int a) {

			Queue<Integer> q = new LinkedList<>();
			visited[a] = true;
			cnt = 0;
			q.add(a);
			while(!q.isEmpty()) {
				int s = q.size();
				for(int i = 0;i<s;i++) {
					int tmp = q.poll();
					if(tmp == b) return cnt;
					
					for(int j : list[tmp]) {
						if(!visited[j]) {
							visited[j] = true;
							
							q.add(j);
						}
					}
				}
				cnt++;
			}
			return -1;
		}
	
	
}
