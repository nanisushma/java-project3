package day22;

import java.util.Arrays;

public class ArrayProblem {

    public static void main(String[] args) {

        int [] ints = new int[5];
        ints [4] =2;
        ints [0] = 10;
        ints [2] = 7;
        ints [1] = 4;
        ints [3] = 6;

        System.out.println(Arrays.toString(ints));

        int [] ints1 = new int[ints.length - 1];

        int i = 0;
        for (int a : ints){
            if (a != 7){
                ints[i] = a;
                i++;
            }
        }
          System.out.println(Arrays.toString(ints1));

        int [] ints2 = new int[ints.length + 2];
            int j = 0;
          for (int a : ints){
              ints2[j] = a;
              j++;
          }

          System.out.println(Arrays.toString(ints2));

          ints2[ints2.length - 1]  = 50;
        System.out.println(Arrays.toString(ints2));


    }
}
