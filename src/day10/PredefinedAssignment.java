package day10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PredefinedAssignment {

    public static void main(String[] args) {


        //double randomValue = Math .random(); //Used comment section so I can make another function
        //System.out.println(randomValue);

        // double randomValue = Math .random()*400;
        //System.out.println(randomValue);

        // double randomValue = Math .random() + 300;
        // System.out.println(randomValue);

        double randomValue = Math.random() / 20;
        System.out.println(randomValue);

        Math.min(7, 40);
        int minimum = Math.min(7, 40);
        System.out.println(minimum);


        Math.max(100, 40);
        int maximum = Math.max(100, 40);
        System.out.println(maximum);

        Math.multiplyExact(20, 30);
        int multiplyExact = Math.multiplyExact(20, 30);
        System.out.println(multiplyExact);

        Math.cbrt(237 - 7976); //gives high level of abstraction
        double cbrt = Math.cbrt(237 - 7976);
        System.out.println(cbrt);


        //Date

        Date beforeDate = new Date();
        System.out.println(beforeDate);

        Date dayBeforeYesterdayDate = new Date(); // try to use old word for replace of new/ but couldn't do it.
        System.out.println(dayBeforeYesterdayDate);

        Date afterDate = new Date();
        System.out.println(afterDate);

        Calendar salaryCalendar = Calendar.getInstance();
        salaryCalendar.set(Calendar.YEAR,2022);
        salaryCalendar.set(Calendar.MONTH,9);
        salaryCalendar.set(Calendar.DAY_OF_MONTH,8);
         System.out.println(salaryCalendar);

         System.out.println(afterDate.getTime());



        Calendar afterdueDate = Calendar.getInstance();
        afterdueDate.set(Calendar.YEAR,2022);
        afterdueDate.set(Calendar.MONTH,2);
        afterdueDate.set(Calendar.DAY_OF_MONTH,8);

        System.out.println(afterdueDate);
        afterdueDate.after(Calendar.getInstance()); // shows trie and false
        System.out.println(afterdueDate);

        afterdueDate.add(Calendar.MONTH,7);
        System.out.println(afterdueDate.getTime());
        System.out.println(afterdueDate.get(Calendar.YEAR));
        System.out.println(afterdueDate.get(Calendar.MONTH));

        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE HH:mm:ss");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    }

}
