import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    static int N, M;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N=Integer.parseInt(st.nextToken());//N까지의 자연수
		M=Integer.parseInt(st.nextToken());//M개 뽑기
		arr = new int[M];
		
		DFS(0);
		System.out.println(sb);
	}
	
	public static void DFS(int dep) {
		if(dep == M) {
			for(int i = 0;i<M;i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
		return;
		}
		else {
			for(int i = 1;i<=N;i++) {
				arr[dep] = i;
				DFS(dep+1);
			}
			return;
		}
	}

}