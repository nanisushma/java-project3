package day13;

public class BlockScope {

    private static int i = 0;

    public static void main(String[] args) {
        System.out.println(i);
        int a = 5;
        System.out.println(a);

        addAndReturn(2,5);


        {
            System.out.println(i);
            System.out.println(a);
            int b = 50;
            System.out.println(b);
        }

        //System.out.println(b);

    }
        public static int addAndReturn(int a, int b){
        int add1 = a + b;
        return add1;
        }

    // System.out.println(a);

}
