package day12;

import java.util.Calendar;
import java.util.Objects;
import java.util.Optional;

public class NullValueHandling {
    public static void main(String[] args) {

        String test ="Not null value"; //null
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR,-1);

      //  test.length();

        // Solution one

        if(test !=null){
            test.length();
        }

        //Solution 2 : Assigining some default value
        //String notNullTest = Objects.requireNonNull(test,"");

        //String notNullTest = Objects.requireNonNull(test,"DEAULT");
       // System.out.println(notNullTest);

        String notNullTest = Objects.requireNonNull(test,"TAMAN");
        System.out.println(notNullTest);

        Calendar notNullCalendar = Objects.requireNonNullElse(calendar,Calendar.getInstance());
        System.out.println(notNullCalendar.getTime());

        //Solution 3:

        Optional<String> optionalOfTest = Optional.of(test);

        if (optionalOfTest.isPresent()){

            System.out.println("The value is not null");
            String notNullOptionalTestString = optionalOfTest.get();
            System.out.println(notNullOptionalTestString);


            System.out.println("The value is null");
        }




    }
}
