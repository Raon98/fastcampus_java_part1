import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = scan.nextInt(); //블럭상태
        System.out.println("num = " + num);

        System.out.print("싨후를 입력하세요 : ");
        float f= scan.nextFloat();
        System.out.println("f = " + f);

        System.out.print("문자열 입력하세요 : ");
        String str = scan.next();
        System.out.println("str = " + str);

        scan.nextLine(); //버퍼비우기 (스트림 비욱리)

        scan.close();
    }
}
