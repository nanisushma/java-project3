package day5;

public class Polymorphism {

    public static void main(String[] args) {


        add(2, 3);
        add(2.0f, 3.0f);
        add(2.0, 3.0);

    }

    public static void add(double a,double b) {
        double add1 = a + b;
        System.out.print(add1);

    }

    public static void add(float a, float b) {
        float add1 = a + b;
        System.out.print(add1);

    }

    public static void add(int a, int b, int c) {
        int add1 = a + b + c;
        System.out.print(add1);
    }

    public static void add(int a, float b){
        float add1 = a + b;
        System.out.print(add1);
    }
}