import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();

        for(int t = 1;t<=T;t++){
            
            int R = sc.nextInt();//반복 횟수
    		String S = sc.next();//문자열
            String P = "";
    		for(int i = 0;i<S.length();i++) {
                for(int r = 0;r<R;r++){
                    P += S.charAt(i);   
                }
    		}
    		System.out.println(P);
            
        }
		
    }
}