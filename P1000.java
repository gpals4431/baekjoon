import java.io.IOException;
import java.util.Scanner;

public class P1000 {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>0 && b>0){
            System.out.println(a+b);
        }
    }
}