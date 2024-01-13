import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] board = new int[N][N];

        int r = 0;
        int c = 0;
        int v = N * N;
        int l = N;
        int s = 0;
        int x = 0;
        int y = 0;
        while (v>0){
            c = s;
            for (int i = c; i < l; i++) {//첫번째내림
                board[i][c] = v--;
            }
            r = l - 1;
            for (int i = c + 1; i < l; i++) {//첫번째우측방향
                board[r][i] = v--;
            }
            c = l - 1;
            for (int i = r-1; i >= s; i--) {//위로
                board[i][c] = v--;
            }
            r = s;
            for (int i = c - 1; i > s; i--) {//좌로
                board[r][i] = v--;
            }
            l--;
            s++;
            r = s;
        }
        int q = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(board[i][j]==q) {
                    x=i+1;
                    y=j+1;
                }
                sb.append(board[i][j] +" ");
            }
            sb.append("\n");
        }
        sb.append(x+" "+y);
        System.out.println(sb.toString());
    }
}
