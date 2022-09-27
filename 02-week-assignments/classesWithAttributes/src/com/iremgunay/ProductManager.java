package com.iremgunay;

public class ProductManager {

    public void add(Product product) {
        //JDBC
        System.out.println("Product added: " + product.getName());
    }

    // overloading
    public void add(int id, String name, String description, double price, int stockAmount) {

    }

}
