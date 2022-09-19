package day8;

public class MarkSheet {

    public static void main(String[] args) {

        String name = "Sushma Karki";
        int studentClass = 8;

        float maths = 32;
        float science = 32;
        float english = 28;
        float computer = 24;
        float social = 26;

        float percentage = ((maths + science + english + computer + social) / 500) * 100;

        System.out.println(percentage);

        boolean isDistinction = percentage >= 80;
        boolean isFirstDivision = percentage >= 70 && percentage < 80;
        boolean isSecondDivision = percentage <= 60 && percentage < 70;
        boolean isThirdDivision = percentage >= 40 && percentage < 60;
        boolean isFailed = percentage <40;


         System.out.println("Distinction :" + isDistinction);
         System.out.println("FirstDivision :" + isFirstDivision);
         System.out.println("SecondDivision :" + isSecondDivision);
         System.out.println("ThirdDivision :" + isThirdDivision);
         System.out.println("Failed :" + isFailed);

            if (percentage >= 80) {
            System.out.println("Congratulations you passed with distinction");}

              else if (percentage >= 70 && percentage < 80) {
                System.out.println("Congratulations you passed with first division");
            }

             else if (percentage >= 60 && percentage < 70) {
                System.out.println("Congratulations you passed with first division");


            }

             else if (percentage >= 80) {
                System.out.println("Congratulations you passed with distinction");


            }
            else if (percentage >= 40 && percentage <60){
                System.out.println("Congratulations you passed with third division");}

            else{
                System.out.println("Sorry you failed");}

        }
    }




