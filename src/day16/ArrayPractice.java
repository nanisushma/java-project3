package day16;

import day4.Student;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] a =new int[10];

        a[3] = 1000;

        Student[] students = new Student[10];

        students[3] = new Student();

        System.out.println(Arrays.toString(students));

        students[5] = new Student();

        //Practice

      int[] integers = new int[4];

      System.out.println(Arrays.toString(integers));

      int secondIndexValue = integers[2];

      System.out.println(secondIndexValue); // 1,3,1,0

      integers [2] = 8;

      secondIndexValue = integers[2];

      System.out.println(secondIndexValue);

      for (int i = 0; i < integers.length ; i++){
          int value = integers[i];
          System.out.println(value);
      }
        //Enhanced for loop
      for ( int value  : integers){

          System.out.println(value);
      }



    }
}
