package com.iremgunay;

public class Main {

    public static void main(String[] args) {
        String message = "Today, weather is sunny.";
        String tempMessage = message.substring(0, 5);
        System.out.println(tempMessage);

        //String result = sum(); // wrong: because sum()'s return type is int
        String result = getCity(); // correct: because getCity()'s return type is String
        System.out.println(result);

        int number = sum(2, 5);
        System.out.println(number);

        int number2 = sum2(2, 5, 7, 7, 8, 9, 10);
        System.out.println("Result of num2 method: " + number2);
    }

    public static void add() {
        System.out.println("Added!");
    }

    public static void delete() {
        System.out.println("Deleted!");
    }

    public static void update() {
        System.out.println("Uptated!");
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
    // add how many numbers you want
    public static int sum2(int... nums) {
        int sum = 0;
        for(int num: nums) {
            sum += num;
        }
        return sum;
    }

    public static String getCity() {
        return "Ankara";
    }
}
