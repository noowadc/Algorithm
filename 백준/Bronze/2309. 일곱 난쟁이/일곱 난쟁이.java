import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int a = -1;
		int b = -1;
		int[] height = new int[9]; //아홉 난쟁이 키
		for(int i = 0;i<9;i++) {
			height[i] = sc.nextInt();//키 입력 받기
			sum += height[i];
		}
		outer : for(int i = 0;i<8;i++) {
			for(int j = 1;j<8;j++) {
				if(i+j<9 && height[i]+height[i+j] == sum - 100) {
					height[i] = a;
					height[i+j] = b;
					break outer;
				}
			}
		}
		Arrays.sort(height);
		
		for(int i = 0 ;i<9;i++) {
			if(height[i] != a && height[i] != b) {
				System.out.println(height[i]);
			}
		
		}
	

		
	}
}
	

