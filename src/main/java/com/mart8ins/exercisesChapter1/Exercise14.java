package com.mart8ins.exercisesChapter1;

import java.util.Arrays;

public class Exercise14 {
    private static void determineMagicSquare(){
        int[][] num = {{16,3,2,13}, {5,10,11,8}, {9,6,7,12}, {4,15,14,1}};
        int rowsSum = 0;
        int colsSum = 0;
        int diognalSum = 0;

        for (int row = 0; row < num.length ; row++) {
            System.out.println(Arrays.toString(num[row])); // prints [4, 15, 14, 1]

            for (int col = 0; col < num[row].length; col++) {
                System.out.println(num[row][col]); // prints 4, 15, 14, 1
                rowsSum += num[row][col]; // counts numbers in rows
                colsSum += num[col][row]; // counts numbers in columns
                diognalSum += num[col][col]; // counts numbers in diognal

            }
        }

        System.out.println("Rows sum is "+ rowsSum);
        System.out.println("Cols sum is "+ colsSum);
        System.out.println("Diognals sum is "+ diognalSum);

        if(rowsSum == colsSum && rowsSum == diognalSum) {
            System.out.println("This is magic square!");
        } else {
            System.out.println("Sorry, there is no magic in this square.");
        }
    }

    public static void main(String[] args) {
        determineMagicSquare();
    }
}
