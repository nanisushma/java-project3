package day3;

public class NewFunction {

    public static void main(String[] args) {

        int a = 15666;
        float b =3;
        int c = 11;
        interest(a,b,c);
        float interest1 = addAndReturn(a,b,c);
        System.out.print(interest1);


        int d = 14565;
        float e = 2;
        int f = 20;
        interest(d,e,f);
        float interest2 = addAndReturn(d, e, f);
        System.out.print(interest2);


        int g = 13464;
        int h = 3;
        int i = 14;
        interest(g,h,i);
        float interest3 = addAndReturn(g, h, i);
        System.out.print(interest3);






    }

    public static float addAndReturn(int a, float b, int c){
        float interest1 = ( a * b * c)/100;
        return interest1;
    }


    public static void interest(int a , float b , int c){
        float interest1 = (a * b* c)/100;
        System.out.print(interest1);

    }
}
