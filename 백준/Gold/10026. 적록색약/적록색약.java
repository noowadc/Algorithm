import java.util.Scanner;

public class Main {

	static int N, count, normal_count, rare_count;
	static String str;
	static char[][] board;
	static boolean[][] visited;
	static int[] rr = {0,0,1,-1};
	static int[] rc = {1,-1,0,0};

	// dfs 탐색
	static void dfs(int r, int c) {
		visited[r][c] = true;
		char temp = board[r][c]; // 같은 값이면 계속 탐색이니까 저장하기
		for(int i = 0; i < 4; i++) {
			int nr = r + rr[i];
			int nc = c + rc[i];
			
			if(nr >= 0 && nc >= 0 && nr < N && nc < N && !visited[nr][nc] && board[nr][nc] == temp) {
				dfs(nr, nc);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		board = new char[N][N];

		for (int i = 0; i < N; i++) {
			str = sc.next();
			for (int j = 0; j < N; j++) {
				board[i][j] = str.charAt(j);
			}
		}

		// 정상인 경우
		count = 0;
		// 정상인 경우 방문 배열 초기화
		visited = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				// 방문하지 않은 곳 찾아서 사방탐색해서 같은 글자 탐색
				if (!visited[i][j]) {
					dfs(i,j);
					//탐색이 끝나면 한 구역인 것 -> 구역 count++
					count++;
				}
			}
		}
		normal_count = count;

		// 색맹인 경우
		count = 0;
		// 색맹용 방문배열 초기화
		visited = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(board[i][j] == 'G') board[i][j] = 'R';
				// 방문하지 않은 곳 찾아서 사방탐색해서 같은 글자 탐색
				}
			}
		
		for(int i = 0; i < N; i ++){
			for(int j = 0; j < N; j++) {
				if (!visited[i][j]) {
					dfs(i,j);
					//탐색이 끝나면 한 구역인 것 -> 구역 count++
					count++;
				}
			}
		}
		rare_count = count;
		System.out.println(normal_count + " " + rare_count);
	}

}
