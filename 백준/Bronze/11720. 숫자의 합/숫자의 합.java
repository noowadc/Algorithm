import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String str = sc.next();
		int ans = 0;
		for(int i = 0;i<N;i++) {
			ans += str.charAt(i)-'0';
		}
		System.out.println(ans);
    }
}