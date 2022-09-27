package com.iremgunay;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product();
        product1.name = "Laptop";
        product1.id = 1;
        product1.description = "Asus Laptop";
        product1.price = 5000;
        product1.stockAmount = 3;

        ProductManager productManager = new ProductManager();
        productManager.add(product1);

    }
}
