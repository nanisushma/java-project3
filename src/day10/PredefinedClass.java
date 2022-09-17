package day10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class PredefinedClass {

    public static void main(String[] args) {

         // Math math = new Math;

        Math.round(5.6);
        long roundedValue = Math.round((5.6));
        System.out.println(roundedValue);

        Math.ceil(5.40f);
        double ceiledValue = Math.ceil(5.00001);
        System.out.println(ceiledValue);

        Math.floor(5.999);
        double flooredValue = Math.floor(5.9999);
        System.out.println(flooredValue);

        Math.random();
       // double randomValue = Math .random();
       // System.out.println(randomValue);

        //double randomValue = Math .random() * 10;
        //System.out.println(randomValue);

        //double randomValue = Math .round(Math.random() * 10);
       // System.out.println(randomValue);

        double randomValue = Math .round(Math.random() * 100);
        System.out.println(randomValue);

        Math.max(5,5000);
        int maximum = Math.max(5,5000);
        System.out.println(maximum);

        Math.min(5,5000);
        int minimum = Math.max(5,5000);
        System.out.println(minimum);


        //Date

        Date currentDate = new Date();
        System.out.println(currentDate);

        Date specificDate = new Date(1661441623799L);
        System.out.println(specificDate);

        // Calender

        //Calendar calendar = Calendar.getInstance();
        //System.out.println(calendar);

        Calendar calendar = Calendar.getInstance(Locale.CANADA);
        System.out.println(calendar);

        Calendar birthCalender = Calendar.getInstance();
        birthCalender.set(Calendar.YEAR,1995);
        birthCalender.set(Calendar.MONTH,8);
        birthCalender.set(Calendar.DAY_OF_MONTH,24);
        System.out.println(birthCalender);

        System.out.println(birthCalender.getTime());

        birthCalender.set(Calendar.YEAR,1990);
        birthCalender.set(Calendar.MONTH,9);
        birthCalender.set(Calendar.DAY_OF_MONTH,25);
        System.out.println(birthCalender);

        Calendar dueDate = Calendar.getInstance();
        dueDate.set(Calendar.YEAR,2022);
        dueDate.set(Calendar.MONTH,6);
        dueDate.set(Calendar.DAY_OF_MONTH,1);
        System.out.println(dueDate.getTime());

        dueDate.add(Calendar.MONTH,5);
        System.out.println(dueDate.getTime());
        System.out.println(dueDate.get(Calendar.YEAR));
        System.out.println(dueDate.get(Calendar.MONTH));

       // SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE HH:mm:ss");
        String formattedDate = simpleDateFormat.format(dueDate.getTime());
        System.out.println(formattedDate);












    }
}
