package com.mart8ins.exercisesChapter1;

public class Exercise7 {
    private static void printValues(int a, int b){
        int one = a;
        int two = b;

        System.out.println("Unsigned sum is " + (a + b));
        System.out.println("Difference is " + (a > b ? a - b : b - a));
        System.out.println("Product is " + (a * b));
        System.out.println("Quotient is " + ((a > b ? a / b : b / a)));
        System.out.println("Reminder is " + ((a > b ? a % b : b % a)));

    }
    public static void main(String[] args) {
        printValues(2,7);
    }
}
