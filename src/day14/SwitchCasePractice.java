package day14;

import java.util.Locale;

public class SwitchCasePractice {

    public static void main(String[] args) {

        String today = "thursday";

     //   if(today.equals("Sunday")){}
      //  else if (today.equals("Monday")){}
      //  else if (today.equals("Tuesday")){}
      //  else if (today.equals("Wednesday")){}
      //  else if (today.equals("Thursday")){}
      // else if (today.equals("Friday")){}
      //  else if (today.equals("Saturday")){}

        switch (today.toLowerCase()){
            case "sunday":{
                System.out.println("Dal Bhat");
                break;
            }
                case "monday":{
                System.out.println("Roti Tarkari");
                break;}

            case "tuesday":
            case "wednesday": {
                System.out.println("Dish3");
                break;}


            case "thursday":{
                System.out.println("Noodles");
                break;}

            case "friday":{
                System.out.println("EggCurry Bhaat");
                break;}

            case "saturday":{
                System.out.println("Chicken Thali");
                break;}

            default:{
                System.out.println("Sorry the day you have entered might be not exits.");
            }
        }

    }
}
