package day3;

public class Function {

    //Function, Method, Procedure
    public static void main(String[] args) {


        int a = 2;
        int b = 15;
        add(a, b);
        int add1 = addAndRetrun(a, b);
        System.out.print(add1);

        int c = 20;
        int d = 15;
        add(c, d);
        int add2 = addAndRetrun(c, d);
        System.out.print(add2);

        int e = 24;
        int f = 35;
        add(e, f);
        int add3 = addAndRetrun(e, f);
        System.out.print(add3);


    }
       public static int addAndRetrun(int a, int b){
        int add1 = a + b;
        return add1;



       }
    public static void add(int a, int b) {
        int add1= a + b;
        System.out.print(add1);

    }



}
