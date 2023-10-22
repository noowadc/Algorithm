import java.util.*;
public class Main {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();//방 세로
		int W = sc.nextInt();//방 가로
		int cnt = 0;
		int sum = 0;
		char[][] room = new char[H][W];
		
		sc.nextLine();
		
		for(int i = 0;i<H;i++) {//행탐색
			String st = sc.nextLine();
			for(int j = 0;j<W;j++) {
				room[i][j] = st.charAt(j);
			}
		}
		
		
		for(int i = 0;i<H;i++) {//행탐색
			cnt = 0;
			for(int j = 0;j<W;j++) {
				if(room[i][j] == '-') {
					cnt++;
				}else cnt = 0;
				if(cnt == 1) sum++;
			}
		}
		

		for(int i = 0 ;i<W;i++) {
			cnt = 0;
			for(int j = 0;j<H;j++) {
				if(room[j][i] == '|') {
					cnt++;
				}else cnt = 0;
				if(cnt == 1) sum++;
			}
		}
		System.out.println(sum);
	}
}