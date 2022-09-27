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




    }
}