import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        String[] arr = s.split(" ");
        int a = 0;
        for(int i = 0;i<arr.length;i++){
            if(!arr[i].isBlank()){
                a++;
            }
        }
        bw.write(a+"\n");
        bw.close();
    }
}