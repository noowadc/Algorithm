import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t = 1;t<=T;t++) {
		int K = sc.nextInt();
		int ans = 0;
		int[] arr = new int[44];
		for(int i = 1;i<=44;i++) {
			arr[i-1] = (i*(i+1))/2;
		}
		
		outer : for(int i = 0;i<44;i++) {
			for(int j = 0;j<44;j++) {
				for(int l = 0;l<44;l++) {
					if(arr[i]+arr[j]+arr[l] == K) {
						ans = 1;
						break outer;
					}
				}
			}
		}
		System.out.println(ans);
		
		}
		
	}
	
}