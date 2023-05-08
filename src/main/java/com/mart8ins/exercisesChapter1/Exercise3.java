package com.mart8ins.exercisesChapter1;

import java.lang.Math;

/*
 * Using only conditional operator, write a program that reads three integers and prints largest. Repeat with Math.max.
 *
 * */
public class Exercise3 {

    private static void printLargest(int a, int b, int c) {
        // USING CONDITIONAL STATEMENTS
//        if(a > b && a > c) {
//            System.out.println("Largest number is " + a);
//        } else if (b > a && b > c) {
//            System.out.println("Largest number is " + b);
//        } else if (c > a && c > b) {
//            System.out.println("Largest number is " + c);
//        }

// USING MATH.MAx
        System.out.println("Largest number using Math.max method is " + Math.max(Math.max(a,b), c));
    }

    public static void main(String[] args) {
        printLargest(5, 10, 99);
        printLargest(5, 110, 99);
        printLargest(988, 10, 99);
    }
}
