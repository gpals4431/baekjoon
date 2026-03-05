import java.io.IOException;
import java.util.Scanner;

public class P14681 {
    public static void main(String[] args) throws IOException {
        // 코드 작성
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if ( x>0 && y>0){
            System.out.println(1);
        } else if ( x<0 && y>0){
            System.out.println(2);
        } else if ( x<0 && y<0){
            System.out.println(3);
        } else {
            System.out.println(4);
        }
    }
}