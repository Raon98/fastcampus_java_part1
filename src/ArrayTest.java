public class ArrayTest {
    public static void main(String[] args) {
        float[] a= new float[5];

        for(int i=0; i<a.length; i++) {
            a[i] = 10;
            System.out.println(a[i]);
        }

        int[] b = {10,20,30,40,50};

        int sum = b[0] + b[4];
        System.out.println(sum);
    }
}
