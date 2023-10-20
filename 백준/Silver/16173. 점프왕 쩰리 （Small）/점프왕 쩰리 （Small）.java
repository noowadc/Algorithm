import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int dr[] = {1, 0};//우, 하
	static int dc[] = {0, 1};
	static int[][] board;
	static boolean[][] visited;
	static int N;
	static String ment = "Hing";
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(bf.readLine());//보드 크기
		board = new int[N][N];//보드 생성
		visited = new boolean [N][N];
		for(int i = 0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for(int j = 0;j<N;j++) {
				board[i][j] = Integer.parseInt(st.nextToken());//이동 가능 칸 수 입력 받기
			}
		}
		
		move(0, 0);
		System.out.println(ment);
		
	}
	
	static void move(int r, int c) {
		if(board[r][c] == -1) {
			ment = "HaruHaru";
			return;
		}
		for(int d = 0;d<2;d++) {
			int nr = r+dr[d]*board[r][c];
			int nc = c+dc[d]*board[r][c];
			if(nr<N && nc<N && !visited[nr][nc]) {
				visited[nr][nc] = true;
				move(nr, nc);
			}
		}
		return;
		
	}
	

}