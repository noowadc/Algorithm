import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

		//부분수열의 합
		static int N, S, sum, cnt;
		static int[] arr;
		public static void main(String[] args) throws NumberFormatException, IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());//수열 크기
			S = Integer.parseInt(st.nextToken());//수열의 합
			arr = new int[N];
			cnt = 0;
			
			StringTokenizer str = new StringTokenizer(br.readLine());
			for(int i = 0;i<N;i++) {
				arr[i] = Integer.parseInt(str.nextToken());
			}
			buYeol(0, 0);
			if(S == 0) cnt--;
			System.out.println(cnt);
		}
		
		public static void buYeol(int sum, int depth) {
			if(depth == N) {
				if(sum == S) {
					cnt++;
					
				}
				return;
			}
				
			buYeol(sum+arr[depth], depth+1);
			buYeol(sum, depth+1);
			
				
		}
		
	
	
}
