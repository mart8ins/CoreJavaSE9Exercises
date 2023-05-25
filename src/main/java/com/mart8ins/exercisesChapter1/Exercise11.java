package com.mart8ins.exercisesChapter1;

public class Exercise11 {
    private static void printNonASCII(String str){

        for (int i = 0; i < str.length(); i++) {
           Character c = Character.valueOf(str.charAt(i));
           int ch = c.hashCode();
           if(ch > 250) {
               System.out.println(c);
           }
        }

    }
    public static void main(String[] args) {
        printNonASCII("123456789()@#$%^&*()_+=-!qwertyuiop[]{};:lkjhgfdsazxvvbnm<>?/.,Hello from skies!#$%^.хороший");
    }
}
