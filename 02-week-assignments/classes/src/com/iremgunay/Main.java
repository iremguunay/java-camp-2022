package com.iremgunay;

public class Main {

    public static void main(String[] args) {
        // classes are reference types
        // create an instance of CustomerManager
        CustomerManager customerManager = new CustomerManager(); // garbage collector will clean up the memory
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        // call customerManager's methods
        customerManager.add();
        customerManager.remove();
        customerManager.update();

        // value type
        int number1 = 10;
        int number2 = 20;
        number2 = number1;
        number1 = 30;
        System.out.println(number2); // result : 10

        // reference type
        int[] numbers1 = new int[]{1, 2, 3};
        int[] numbers2 = new int[]{4, 5, 6};
        numbers2 = numbers1;
        numbers1[0] = 10;
        System.out.println(numbers2[0]); // result : 10



    }
}