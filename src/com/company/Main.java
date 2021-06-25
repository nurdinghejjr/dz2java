package com.company;


public class Main {

    public static void main(String[] args) {
        System.out.println("Start of the program");


        System.out.println(kara(23, 15));
        System.out.println( kara(39, 26));
        System.out.println(kara(34, 43));
        System.out.println( kara(16, 18));
        System.out.println( kara(13, 16));
        System.out.println("End of the program");
    }

    public static String kara(int age, int tempera) {
        if (age > 20 && age < 45 && tempera > -20 && tempera < 30) {
            return "можно идти гулять1";
        } else if (age < 25 && tempera > 0 && tempera < 28) {
            return "можно идти гулять2";
        } else if (age > 45 && tempera < -10 && tempera < -25) {
            return "можно идти гулять3";
        } else {
            return "остовайтесь дома";
        }
    }
}






















