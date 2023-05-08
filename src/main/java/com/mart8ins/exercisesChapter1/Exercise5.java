package com.mart8ins.exercisesChapter1;

/*
* What happens when you cast a double to an int that is larger than the largest possible int value?
* */


public class Exercise5 {
    private static void printCasting(){
        int largest = (int) Double.MAX_VALUE;
        System.out.println(Double.MAX_VALUE);
        System.out.println(largest);
    }
    public static void main(String[] args) {
        printCasting();
    }
}
