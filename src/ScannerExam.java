import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("제목 : ");
        String title = sc.nextLine();
        System.out.println(title);

        System.out.println("가격 : ");
        int price = sc.nextInt();
        System.out.println(price);

        System.out.println("출판사 : ");
        String company = sc.nextLine();
        System.out.println(company);

        System.out.println("페이지 수 : ");
        int page = sc.nextInt();
        System.out.println(page);
    }
}
