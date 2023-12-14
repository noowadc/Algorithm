import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int arr[] = new int[N];
        int a = 0;
        int b = 0;
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
            a = arr[i] > a ? arr[i] : a;
            b += arr[i];
        }
        
        while(a <= b) {
            int mid = (a + b)/2;
            int sum = 0;
            int cnt = 0;
            for(int i=0; i<N; i++) {
                if(sum + arr[i] > mid) {
                    sum = 0;
                    cnt++;
                }
                sum += arr[i];
            }
            if(sum != 0) cnt++;
            if(cnt <= M) b = mid - 1;
            else a = mid + 1;
        }
        System.out.println(a);
    }
}