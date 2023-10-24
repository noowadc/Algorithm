import java.util.Scanner;

public class Main {

	//유기농 배추
	static int M, N, K;
	static int[][] field;
	static int[] dr = {0, 0, -1, 1};
	static int[] dc = {1, -1, 0, 0};
	static boolean[][] visited;
	static int cnt;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t = 1;t<=T;t++) {
			M = sc.nextInt();//배추밭 가로 길이
			N = sc.nextInt();//배추밭 세로 길이
			K = sc.nextInt();//배추의 위치
			field = new int[M][N];
			visited = new boolean[M][N];
			cnt=0;

			for(int i = 0;i<K;i++) {
				int X = sc.nextInt();//배추위치 x축
				int Y = sc.nextInt();//배추위치 y축
				field[X][Y] = 1;
			}
			
			for(int i = 0;i<M;i++) {
				for(int j = 0;j<N;j++) {
					if(!visited[i][j] && field[i][j] == 1) {
						cnt++;
						TS(i, j);
					}
				}
			}
			System.out.println(cnt);
		}
	}
	
	public static void TS(int r, int c) {
		visited[r][c] = true;
	
		for(int d = 0;d<4;d++) {
			int nr = r + dr[d];
			int nc = c + dc[d];
			if(nr>=0 && nc>=0 &&nr<M && nc<N && !visited[nr][nc] && field[nr][nc]==1) {
				TS(nr, nc);
			}
		}
	}
	
}