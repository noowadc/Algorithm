import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, S, cnt;
    static int[] arr;
    public static void main(String[] args) throws IOException {

        //부분수열의 합
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        N = Integer.parseInt(str.nextToken());
        S = Integer.parseInt(str.nextToken());
        arr = new int[N];
        cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        DFS(0, 0);
        if(S == 0) cnt--;
        System.out.println(cnt);
    }

    public static void DFS(int i, int sum){
        if(i == N) {
            if (sum == S) {
                cnt++;
            }
            return;
        }

        DFS(i+1, sum + arr[i]);
        DFS(i+1, sum);
    }
}