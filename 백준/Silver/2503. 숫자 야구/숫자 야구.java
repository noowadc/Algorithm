import java.util.Scanner;

public class Main {	
public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int ans = 0;

	        int[] arr = new int[1000];
	        boolean[] check = new boolean[1000];
	        for (int i = 123; i <= 987; i++) {  //서로 다른 숫자 세개로 구성하므로
	            String str = Integer.toString(i);   //각 자리수 비교하기 위해 형변환
	 
	            if (str.charAt(0) == str.charAt(1) || str.charAt(0) == str.charAt(2) || str.charAt(1) == str.charAt(2)
	                ||str.charAt(0)=='0' || str.charAt(1)=='0' ||str.charAt(2)=='0') {  //서로 다른 숫자로 구성되지 않았으면 -1로 지정
	                check[i] = true;
	            }
	        }

	        String strNum;
	        int strike;
	        int ball;
	        for (int i = 1; i <= N; i++) {       //N : 민혁이가 영수에게 질문한 횟수
	            strNum = sc.next();
	            strike = sc.nextInt();
	            ball = sc.nextInt();

	            int strikeCnt = 0;
	            int ballCnt = 0;
	 
	            for (int idx = 123; idx <= 987; idx++) {    //반복문 돌면서 strike, ball 검사
	                if (check[idx] == true) continue;
	                int passCnt = 0;
	                //strike 검사
	                strikeCnt = 0;
	                String strIdx = Integer.toString(idx);
	                for (int j = 0; j < 3; j++) {
	                    if (strNum.charAt(j) == strIdx.charAt(j)) strikeCnt++;
	                }
	 
	                //strike 수는 맞았으니 Ball 검사
	                ballCnt = 0;
	                for (int p = 0; p < 3; p++) {
	                    for (int q = 0; q < 3; q++) {
	                        if ((strNum.charAt(p) == strIdx.charAt(q)) && (p != q)) {
	                            ballCnt++;
	                        }
	                    }
	                }
	                if ((strike != strikeCnt) || ball != ballCnt) {
	                    check[idx] = true;
	                    continue;
	                }
	 
					//통과된 횟수 카운트
	                if ((strike == strikeCnt) && (ball == ballCnt)) {
	                    arr[idx]++;
	                }
	            }
	 
	        }
	 
	        for (int i = 123; i <= 987; i++) {
	 
	            if (!check[i] && arr[i] == N) {	//물어본 횟수만큼 다 만족했으면 그 숫자는 답
	                ans++;
	            }
	        }
	        System.out.println(ans);
	 
	    }
	
	
}
