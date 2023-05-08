package com.mart8ins.exercisesChapter1;

import java.math.BigInteger;

public class Exercise6 { // int can hold factorial only for number 13 max???
    private static void printFactorial(int num){

        BigInteger SUM = BigInteger.valueOf(1);

        for (int i = 1; i <= num; i++) {
            SUM = SUM.multiply(BigInteger.valueOf(i));
        }

        System.out.println(SUM);
    }
    public static void main(String[] args) {
        printFactorial(100);
    }
}
