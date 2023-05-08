package com.mart8ins.exercisesChapter1;
/*
* Write a program that reads an integer angle (positive and negative) and normalizes it to a value between 0 - 359.
* Try it first with % and after with floorMod.
*
* minus 5 deg needs to bee 354deg
* */
public class Exercise2 {
    private static void printAngle(int angle){
        int circle = 359;
        int ang = angle % circle;
        int result = ang > 0 ? ang : 359 - Math.abs(ang);
        System.out.println("Angle is " + result);

//        System.out.println(Integer.florMood);
    }
    public static void main(String[] args) {
        printAngle(-255);
    }
}
