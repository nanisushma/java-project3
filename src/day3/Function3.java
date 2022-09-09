package day3;

public class Function3 {

    public static void main(String[] args) {

        int a = 100;
        int b = 90;
        int c = 80;
        add(a,b,c);
        int add1 = addAndRetrun(a,b,c);
        System.out.print(add1);



        int d = 70;
        int e = 60;
        int f = 50;
        add(d,e,f);
        int add2 = addAndRetrun(d,e,f);
        System.out.print(add2);


        int g = 40;
        int h = 30;
        int i = 20;
        add(g,h,i);
        int add3 = addAndRetrun(g,h,i);
        System.out.print(add3);


    }


      public static int addAndRetrun(int a, int b, int c){
        int add1 = a + b + c;
        return add1;
      }


     public static void add(int a, int b ,int c){
        int add1 = a + b + c;
        System.out.print(add1);
     }
}
