package com.iremgunay;

public class Main {

    public static void main(String[] args) {

        int number1 = 220;
        int number2 = 284;

        int sumOfDivisors1 = 0;
        int sumOfDivisors2 = 0;

        for(int i = 1; i < number1; i++) {
            if(number1 % i == 0) {
                sumOfDivisors1 += i;
            }
        }

        for(int i = 1; i < number2; i++) {
            if(number2 % i == 0) {
                sumOfDivisors2 += i;
            }
        }

        if(sumOfDivisors1 == number2 && sumOfDivisors2 == number1) {
            System.out.println("Numbers are amicable");
        } else {
            System.out.println("Numbers are not amicable");
        }
    }
}
