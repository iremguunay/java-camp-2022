package com.iremgunay;

public class Main {

    public static void main(String[] args) {
        char letter = 'E';

        switch (letter) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(letter + " is a bold vowel.");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println(letter + " is a hot vowel.");
                break;
            default:
                System.out.println(letter + " is a vowel letter.");
        }
    }
}
