package day14;

import java.util.Scanner;

public class SalesApp {

    private static int TARGET = 1000;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your today's sales : ");
        int sales = scanner.nextInt();

        int bonus = 0;

        if (sales >= TARGET) {
            bonus += 100;

        }

        else{
            bonus += 0;
        }
        String message = String.format("You have earned bonus = %d",bonus);
        System.out.println(message);

    }
}
