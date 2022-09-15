package com.iremgunay;

public class Main {

    public static void main(String[] args) {
        //For
        for (int i = 0; i < 10; i+=2) { // for (int i = 0; i < 10; i++)
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti");

        int i = 1;
        //While
        while(i < 10) { // (i < 10) -> infinity loop
            System.out.println(i);
            i++;
        }
        System.out.println("While Döngüsü Bitti");

        int j = 1;
        //Do-While
        do{ //even if condition isn't met, code will work
            System.out.println(j);
            j+=2;
        } while(j < 10);

        System.out.println("Do-While Döngüsü Bitti");

    }
}
