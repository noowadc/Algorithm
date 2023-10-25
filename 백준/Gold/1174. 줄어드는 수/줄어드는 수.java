import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    //줄어드는 수
	static int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
	static ArrayList<Long> list;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		list = new ArrayList<>();
		
		int N = Integer.parseInt(br.readLine());
		DFS(0, 0);
		
		Collections.sort(list);
		if(N>1023) System.out.println(-1);//10개의 숫자가 포함되냐 안되냐의 문제이므로 2의 10제곱
		else System.out.println(list.get(N-1));
			
	}
	public static void DFS(long a, int idx) {
		if(!list.contains(a)) list.add(a); //a가 이전에 나온적 없으면 list에 추가
		if(idx>=10) return;//배열 모두 탐색했으면 호출 종료
		DFS(a*10+arr[idx], idx+1);//현재 수를 선택하는 경우
		DFS(a, idx+1);//선택하지 않는 경우
	}
	
}
