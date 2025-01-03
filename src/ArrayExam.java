public class ArrayExam {
    public static void main(String[] args) {
        int a;
        a=10;

        int[] b = new int[3];

        char[] c = {'A','P','P','L','E'};

        for(int i=0; i<c.length; i++){
            System.out.print((char) (c[i] + 32));
        }

        String abc = "ABC";

        System.out.print(abc.toLowerCase());
    }
}
