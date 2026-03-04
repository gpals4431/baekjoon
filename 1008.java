import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //소수점 9자리 이상 출력 -> double로 선언
        double a = Integer.parseInt(st.nextToken());
        double b = Integer.parseInt(st.nextToken());

        double result = a / b;
        System.out.println(result);
    }
}