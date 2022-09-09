package day3;

public class FunctionVersion {

    public static void main(String[] args) {

    int vivek = 60;
    int sir10 = 70;
    int ram = 20;
    add(vivek, sir10);
    int add1 = addAndRetrun(vivek,sir10);
    System.out.print(add1);


    int ashmit = 50;
    int prem = 30;
    add(ashmit,prem);
    int add2 = addAndRetrun(ashmit,prem);
    System.out.print(add2);


    int sushil = 20;
    int susanta = 10;
    add(sushil, susanta);
    int add3 = addAndRetrun(sushil,susanta);
    System.out.print(add3);



    }

    public static int addAndRetrun(int a, int b){
        int add1 = a + b;
        return add1;
    }

    public static void add(int vivek, int sir10){
        int add1 = vivek + sir10;
        System.out.print(add1);
    }
}
