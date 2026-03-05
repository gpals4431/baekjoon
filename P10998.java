import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class P10998 {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // if(a>0 && b<10){?
            System.out.println(a*b);
        // }else{
        //     System.out.println("Input values must be between 1 and 9.");
        // }
    }
}