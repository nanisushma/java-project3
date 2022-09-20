package day20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class DateSorting {

    public static void main(String[] args) {

        String[] stringsDates = new String[3];

        stringsDates[0] = "2022-09-13";
        stringsDates[1] = "2021-9-13";
        stringsDates[2] = "2019-09-13";

        System.out.println(Arrays.toString(stringsDates));

        Arrays.sort(stringsDates);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yyyy");


        Date[] dates = new Date[3];

        for (int i = 0; i < stringsDates.length; i++) {

            try {
                dates[i] = simpleDateFormat.parse(stringsDates[i]);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Arrays.toString(dates));


    }
}






