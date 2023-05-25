package com.mart8ins.exercisesChapter1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Exercise13 {
    private static void printLotteryCombination(){
        ArrayList numbers = new ArrayList<>();
        ArrayList luckyNumbers = new ArrayList<>();

        for (int i = 1; i <= 49; i++) {
            numbers.add(i);
        }
        System.out.println("Lottery numbers: ");
        System.out.println(numbers);

        for (int i = 1; i <= 6 ; i++) {
            int random = new Random().nextInt(1,49);
            numbers.remove(random);
            luckyNumbers.add(random);
        }

        System.out.println("Lucky numbers: ");
        luckyNumbers.sort(Comparator.naturalOrder());
        System.out.println(luckyNumbers);
    }
    public static void main(String[] args) {
        printLotteryCombination();
    }
}
