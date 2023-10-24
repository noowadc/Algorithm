import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    //체스판 다시 칠하기
	static int M, N, cnt, cntt, ans, tmp;
	static char[][] board;
	static String str;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		tmp = 100;
		board = new char[N][M];
		for(int i= 0;i<N;i++) {
			str = bf.readLine();
			for(int j = 0;j<M;j++) {
				board[i][j] = str.charAt(j)
						;
			}
		}
		for(int i= 0;i<N-7;i++) {
			for(int j = 0;j<M-7;j++) {
				check(i, j);
				tmp = Math.min(tmp, ans);
			}
		}
		
		System.out.println(tmp);
	}
	
	
	public static void check(int r, int c) {
		cnt = 0;
		cntt = 0;
		for(int i = r;i<r+8;i++) {
			for(int j = c;j<c+8;j++) {
				if(i%2 == 0) {
					//짝수 인덱스가 W, 홀수가 B
					if((j % 2 == 0 && board[i][j]=='B')||(j % 2 == 1 && board[i][j]=='W')) {
						cnt++;
					}
					//짝수 인덱스가 B, 홀수가 W
					if((j % 2 == 0 && board[i][j]=='W')||(j % 2 == 1 && board[i][j]=='B')) {
						cntt++;
					}
				}
				else if(i%2 == 1) {
					//짝수 인덱스가 B, 홀수가 W
					if((j % 2 == 0 && board[i][j]=='W')||(j % 2 == 1 && board[i][j]=='B')) {
						cnt++;
					}
					//짝수 인덱스가 W, 홀수가 B
					if((j % 2 == 0 && board[i][j]=='B')||(j % 2 == 1 && board[i][j]=='W')) {
						cntt++;
					}
				}
				
			}
		}
		ans = Math.min(cnt, cntt);
	}
	
	
}