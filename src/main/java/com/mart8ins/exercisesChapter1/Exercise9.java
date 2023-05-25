package com.mart8ins.exercisesChapter1;

public class Exercise9 {

    private static void compareString(String str) {
        String string = "Home1111";

        System.out.println("String compare using .compareTo, return integer what represents count of differences");
        System.out.println(string.compareTo(str));

        System.out.println("String compare using .contains, return boolean if string contains string");
        System.out.println(string.contains(str));

        System.out.println("String compare using .compareToIgnoreCase, return integer what represents count of differences, ignores letter cases");
        System.out.println(string.compareToIgnoreCase(str));

        System.out.println("String compare using .contentEquals, return boolean, checks if string ar equal");
        System.out.println(string.contentEquals(string));

    }
    public static void main(String[] args) {
        compareString("Home");
    }
}
