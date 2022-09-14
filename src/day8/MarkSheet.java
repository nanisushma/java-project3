package day8;

public class MarkSheet {

    public static void main(String[] args) {

        String name = "Sushma Karki";
        int studentClass = 8;

        float maths = 85;
        float science = 85;
        float english = 80;
        float computer = 85;
        float social = 89;

         float percentage = ((maths + science + english + computer + social)/500)*100;

         System.out.println(percentage);

         boolean isDistinction = percentage >= 80;
         boolean isFirstDivision = percentage >= 70 && percentage < 80;
         boolean isSecondDivision = percentage <= 55 && percentage < 50;
         boolean isThirdDivision = percentage >= 45 && percentage < 40;
         boolean isFailed = percentage >= 35 && percentage <40;


         System.out.println("Distinction :" + isDistinction);
         System.out.println("FirstDivision :" + isFirstDivision);
         System.out.println("SecondDivision :" + isSecondDivision);
         System.out.println("ThirdDivision :" + isThirdDivision);
         System.out.println("Failed :" + isFailed);




        }
    }

