public class ArithmeticOperTest {
    public static void main(String[] args) {
        int digit =3625;
        System.out.print(digit%10);
        System.out.print(digit/10%10);
        System.out.print(digit/100%10);
        System.out.print(digit/1000%10);

        int su =5;
        if(su%2==0){
            System.out.println("짝수입니다.");
        }else {
            System.out.println("홀수입니다.");
        }
    }
}

