package com.mart8ins.exercisesChapter1;

import java.util.Random;

public class Exercise10 {
    private static void generateRandomString(){
        long randomLong = new Random().nextLong();
        String str = Long.toString(randomLong, 36);
        System.out.println(str);
    }
    public static void main(String[] args) {
        generateRandomString();

    }
}
