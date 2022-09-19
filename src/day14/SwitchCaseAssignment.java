package day14;

import java.util.Scanner;

public class SwitchCaseAssignment {

    private static int TARGET;

    public static void main(String[] args) {

        Scanner sales = new Scanner(System.in);
        System.out.println("Name of SalesPerson:");


        String name = sales.nextLine();
        String greetings = String.format("Good Evening %s, ",name);
        System.out.println(greetings);


        System.out.println("Your sales for a day:" );
        int salesBonus = sales.nextInt();
        int bonus = 0;


        if (salesBonus >= 2 * TARGET){
            bonus += 1000;
        }

        else if (salesBonus >= TARGET){
            bonus += 240;
            System.out.printf("Your bonus for the day is: %d", bonus);
        }

        else if (salesBonus >= TARGET){
            bonus = +60;
            System.out.printf("Your bonus for the day is: %d", bonus);
        }
        else {
            System.out.printf("you haven't got any bonus for the day.%d",bonus);
        }
    }
}
