package com.iremgunay;

public class Main {

    public static void main(String[] args) {
        int sayi = 24;

        //if elseIf else
        if(sayi < 20) {
            System.out.println("Sayı 20'den küçüktür.");
        } else if(sayi == 20) {
            System.out.println("Sayı 20'ye eşittir.");
        } else {
            System.out.println("Sayı 20'den büyüktür.");
        }

        //if else
        if(sayi < 20) {
            System.out.println("Sayı 20'den küçüktür.");
        } else {
            System.out.println("Sayı 20'den küçük değildir.");
        }

        //if
        if(sayi < 20) {
            System.out.println("Sayı 20'den küçüktür.");
        }
        if(sayi < 15){
            System.out.println("Sayı 15'ten küçüktür.");
        }

    }
}
