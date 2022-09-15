package com.iremgunay;

import java.util.Scanner;

public class Main {

    // My solution
    public static boolean isPrime(int number) {
        int remainder = number % 2;

        if (number < 2) {
            return false;
        } else if (number == 2 || number == 3) {
            return true;
        } else if (remainder == 0) {
            return false;
        }

        for(int i = 3; i <= Math.sqrt(number); i += 2) {
            remainder = number % i;
            if (remainder == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if(isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // 2. Solution:
        System.out.println("2. Solution:");

        boolean result = true;
        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                result = false;
            }
        }

        if(result && number > 1) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

    }
}
