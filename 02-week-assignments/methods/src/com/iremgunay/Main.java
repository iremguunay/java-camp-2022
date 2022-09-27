package com.iremgunay;

public class Main {

    public static void main(String[] args) {
        findNumber();
    }
    // methods provide us to write reusable codes
    public static void findNumber() {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 6;
        boolean varMi = false;

        for (int sayi: sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }

        if(varMi) {
            mesajVer("Sayı mevcuttur: " + aranacak);
        } else {
            mesajVer("Sayı mevcut değildir: " + aranacak);
        }
    }
    // pass variable to method
    public static void mesajVer(String message) {
        System.out.println(message);
    }
}
