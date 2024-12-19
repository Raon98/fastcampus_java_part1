public class VDATest {
    public static void main(String[] args) {
        int v; // 변수선언 -> 기억공간
        v=10;
        System.out.println(v);

        int a =10;
        int b = a;
        int c = b*10;
        System.out.println(c);

        int sum =0;
        sum = sum+1;
        sum = sum+2;
        sum = sum+3;
        sum = sum+4;
        sum = sum+5;
        System.out.println(sum);

        int x =10;
        int y = 20;
        int temp = y;

        y = x;
        x = temp;
        System.out.println("x : "+x);
        System.out.println("y : "+y);
    }
}
