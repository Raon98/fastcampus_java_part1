public class LogicalOperTest {
    public static void main(String[] args) {
        int x=1, y=0;
        System.out.println(!(x>y));
        System.out.println((x>0 && y<3));
        System.out.println((x>0 && y<0));
        System.out.println((x<0 || y>=0));
        System.out.println((y<0 && y>-5));

        int a=3,b=5;
        System.out.println(a>3 && b<6);
        System.out.println(a!=3 && a>2);
        System.out.println(a!=3 || a>2);
        System.out.println(b!=5 || a==1);
    }
}
