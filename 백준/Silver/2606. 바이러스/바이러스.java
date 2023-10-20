import java.util.Scanner;

public class Main {

	static int N, M, cnt;
	static int[][] arr;
	static int[] f;
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	N = sc.nextInt();
	M = sc.nextInt();
	arr = new int[N+1][N+1];
	cnt = 0;
	f = new int[N+1];
	
	for(int i = 0;i<M;i++) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		arr[a][b] = 1;
	}// 연결
	
	for(int i = 1;i<N+1;i++) {//makeset
		f[i] = i;
	}
	
	for(int i = 1;i<N+1;i++) {
		for(int j = 1;j<N+1;j++) {
			if(arr[i][j] == 1) {
				union(findset(i), findset(j));
			}
		}
	}
	
	for(int i = 2;i<N+1;i++) {
		if(findset(i) == 1) cnt++;
	}
	System.out.println(cnt);
	
	}
	
	
	static void union(int i, int j) {
		if(i<j) f[j] = i;
		else f[i] = j;
	}

	static int findset(int x) {
		if(x==f[x]) {
			f[x] = x;
			return x;
		}
		else{
			f[x] = findset(f[x]);
			return f[x];
		}
	}
	

}
