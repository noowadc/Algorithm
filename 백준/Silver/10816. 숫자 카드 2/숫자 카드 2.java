import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());

            if(hashMap.containsKey(num)){//입력 받은 수가 카드 내 카드 중에 있으면
                int temp = hashMap.get(num);
                temp++;
                hashMap.put(num,temp);//더해준 값을 value에 넣기
            }else{
                hashMap.put(num,1);
            }

        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M ; i++) {
            int temp = Integer.parseInt(st.nextToken());

           if(hashMap.containsKey(temp)){
                sb.append(hashMap.get(temp)).append(" ");
           }else{
               sb.append(0).append(" ");
           }
        }

        System.out.println(sb.toString());

    }
}