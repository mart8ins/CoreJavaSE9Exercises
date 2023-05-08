package com.mart8ins.exercisesChapter1;

/*
* Write a programm that prints the smallest and largest positive double value. Hint: Look up Math.nextUp in the Java API
* */
public class Exercise4 {
    private static void printSmalestLargestDoubleValue(double dob, float fl){
        System.out.println(Math.nextUp(dob));
        System.out.println(Math.nextUp(fl));
    }
    public static void main(String[] args) {
        printSmalestLargestDoubleValue(21.544d, 1.01f);
    }
}
