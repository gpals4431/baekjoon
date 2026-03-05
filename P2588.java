import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedReader;


public class P2588 {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int c = (a*(b%10));
        int d = (a*((b%100)/10));
        int e = (a*(b/100));
        int result = a*b;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(result);
    }
}