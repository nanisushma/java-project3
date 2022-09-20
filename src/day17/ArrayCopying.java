package day17;

import java.util.Arrays;

public class ArrayCopying {

    public static void main(String[] args) {

        int[] smallPrimes = {2, 3, 5, 7, 11, 13};

        System.out.println(Arrays.toString(smallPrimes));

        //int[] smallPrimeDuplicate = smallPrimes;
        int[] smallPrimeDuplicate = Arrays.copyOf(smallPrimes, smallPrimes.length);
        smallPrimeDuplicate[0] = 1;
        //changeArray(smallPrimes);

        System.out.println(Arrays.toString(smallPrimes));

    }

    public static void changeArray(int[] primes){
     primes[0] = 1;
    }
}
