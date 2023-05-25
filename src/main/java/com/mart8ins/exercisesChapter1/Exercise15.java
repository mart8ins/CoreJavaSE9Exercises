package com.mart8ins.exercisesChapter1;

import java.util.ArrayList;

//https://www.geeksforgeeks.org/java-program-to-print-pascals-triangle/
//https://www.tutorialspoint.com/Java-program-to-print-Pascal-s-triangle
public class Exercise15 {

    static int factorial(int n) {
        int f;

        for(f = 1; n > 1; n--){
            f *= n;
        }
        return f;
    }
    static int ncr(int n,int r) {
        return factorial(n) / ( factorial(n-r) * factorial(r) );
    }
    private static void printPascalsTriangle(int n){

    }
    public static void main(String[] args) {
        printPascalsTriangle(5);
    }
}
