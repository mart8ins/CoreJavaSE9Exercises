package com.mart8ins.exercisesChapter1;

/*
 * Write a program that reads an integer  and prints it in binary, octal and hexadecimal. Print the reciprocal as a
 * hexadecimal floating-point number.
 * */

import java.sql.SQLOutput;

public class Exercise1 {
    private static void printNumber(int num) {
        int numb = num;

        // PRINTS BINARY - MY IMPLEMENTATION
        String binary = "";
        do{
            if(numb % 2 == 0) {
                binary = "0" + binary;
            } else {
                binary = "1" + binary;
            }
            numb= numb / 2;
        } while (numb > 0);
        System.out.println("Binary number, my implementation: " + binary);
        // PRINTS BINARY - USING METHOD
        System.out.println("Binary number, Integer method: " + Integer.toBinaryString(num));

        // PRINTS OCTAL - USING METHOD
        System.out.println("Octal number, Integer method: " + Integer.toOctalString(num));

        // PRINTS HEXADECIMAL - USING METHOD
        System.out.println("Hexadecimal number, Integer method: " +Integer.toHexString(num));

    }
    public static void main(String[] args) {
        printNumber(555);
    }
}
