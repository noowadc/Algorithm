import java.util.Scanner;

public class Main {
    static int N, M;
	static int[] arr;
	static boolean[] visited;
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	N = sc.nextInt();//자연수
	M = sc.nextInt();//뽑는 개수
	arr = new int[M+1];
	visited = new boolean[N+1];
	
	
		DFS(0);
	
}

public static void DFS(int depth) {
	if(depth == M) {//뽑아야 하는 개수만큼 뽑으면 출력
		for(int i = 0;i<M;i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		return;
	}
	
	for(int i = 1;i<=N;i++) {
		if(!visited[i]) {//안뽑았으면
			visited[i] = true;//뽑은 거 체크
			arr[depth] = i; //뽑고
			DFS(depth+1);//다음 탐색
			visited[i] = false;//체크 풀기
			
		}
		
	}
}
    
    
}