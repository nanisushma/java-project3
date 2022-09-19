package day13;

import java.util.Scanner;

public class MarkSheet {

    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);
        //String name = scanner.next();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student's Name");

        String name = scanner.nextLine();


      System.out.println("Enter mark obtained in Math");
        int maths = scanner.nextInt();

        System.out.println("Enter mark obtained in science");
        int science = scanner.nextInt();

        System.out.println("Enter mark obtained in english");
        int english = scanner.nextInt();

        System.out.println("Enter mark obtained in computer");
        int computer = scanner.nextInt();

        System.out.println("Enter mark obtained in social");
        int sociL = scanner.nextInt();

        //System.out.println(name);
        //System.out.println(maths);
       // System.out.println(science);
        //System.out.println(english);
        //System.out.println(computer);
        //System.out.println(sociL);

        float percentage =((maths + science + english + computer + sociL )/500f)*100;

        System.out.println(percentage);

        String output = name + "percentage =" + String.format("%.2f",percentage);
        String outputPercentage = String.format("%s percentage = %.2f",name,percentage);

        String messgae =String.format("Hi %s .This is a new offer for you.",name);


        System.out.println(outputPercentage);


    }
}
