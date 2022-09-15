package com.iremgunay;

public class Main {

    public static void main(String[] args) {

        String ogrenci1 = "Engin";
        String ogrenci2 = "Derin";
        String ogrenci3= "Salih";
        String ogrenci4 = "Ahmet";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("---------------------------");

        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Salih";
        //ogrenciler[3] = "Ali"; - error: index out of bounds

        for(int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        System.out.println("2. Yöntem:");

        for(String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }

        System.out.println("---------------------------");

        String[] ogrenciler2 = {"Ayşe", "Sevgi", "Melek", "Ali"};

        for (int i = 0; i < ogrenciler2.length; i++) {
            System.out.println(ogrenciler2[i]);
        }

    }
}
