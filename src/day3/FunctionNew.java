package day3;

public class FunctionNew {

    public static void main(String[] args) {

        int a = 90;
        int b = 50;
        subtract(a ,b);
        int subtract1 = addAndRetrun(a, b);
        System.out.print(subtract1);

        int c = 50;
        int d = 35;
        subtract(c, d);
        int subtract2 = addAndRetrun(c, d);
        System.out.print(subtract2);


        int e = 40;
        int f = 35;
        subtract(e, f);
        int subtract3 =addAndRetrun(e, f);
        System.out.print(subtract3);

    }

      public static int addAndRetrun(int c, int d){
        int subtract2 = c - d;
        return subtract2;
      }

      public static void subtract(int c, int d){
        int subtract2 = c - d;
        System.out.print(subtract2);
      }
}
