package com.mart8ins.exercisesChapter1;

public class Exercise8 {
    private static void printSubstrings(String string, int length){

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length ; j++) {
                System.out.println(string.substring(i, j));
                String ch = string.substring(i, j);
                System.out.println(ch);
            }
        }

    }
    public static void main(String[] args) {
        String name = "Hello!";
        printSubstrings(name, name.length());
    }
}
