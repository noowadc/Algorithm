import java.util.Scanner;

class Main {
    static int dr[] = {0, 0, -1, 1, -1, 1, -1, 1};
    static int dc[] = {-1, 1, 0, 0, 1, 1, -1, -1};
    static int w, h, cnt;
    static int[][] map;
    static boolean[][] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            w = sc.nextInt();//지도 너비
            h = sc.nextInt();//지도 높이
            if(w == 0 && h == 0) break;
            cnt = 0;
            map = new int[h][w];
            visited = new boolean[h][w];
            for(int i = 0;i<h;i++){
                for(int j = 0;j<w;j++){
                    map[i][j] = sc.nextInt();
                }
            }
    
            for(int i = 0;i<h;i++){
                for(int j = 0;j<w;j++){
                    if(!visited[i][j] && map[i][j] == 1){
                        DFS(i, j);
                        cnt++;
                    }
    
                }
            }
            System.out.println(cnt);
    	}
    }
    public static void DFS(int r, int c){
        visited[r][c] = true;

        for(int d = 0;d<8;d++){
            int nr = r+dr[d];
            int nc = c+dc[d];

            if(nr>=0 && nc>=0 && nr<h && nc<w ){
                if(map[nr][nc] == 1 && !visited[nr][nc]){
                    DFS(nr, nc);
                }
            }
        }
    } 
}