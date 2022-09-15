package com.iremgunay;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int numberToFind = 5;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numberToFind) {
                found = true;
                break;
            }
        }

        if(found) {
            System.out.println(numberToFind + " is found");
        } else {
            System.out.println(numberToFind + " is not found");
        }
    }
}
