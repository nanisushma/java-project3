package day16;

import java.math.BigInteger;

public class BigNumberPractice {
    public static void main(String[] args) {


        long i = 1000000000000000000L;

        BigInteger accountBalance = new BigInteger("1000000000000000000");

        //BigInteger sum = accountBalance.add(BigInteger.TEN);

        BigInteger sum = accountBalance.add(BigInteger.valueOf(10));
        BigInteger sub = accountBalance.subtract(new BigInteger("1000000000000000"));

        System.out.println(sub);
        System.out.println(sum);

        int sign = sub.signum();

        System.out.println(sign);
        if (sign < 0) {
            System.out.println("The subtract value is negative");
        }else {

            System.out.println("The subtracted value is positive");


        }
    }
}