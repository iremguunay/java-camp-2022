package com.iremgunay;

public class Main {

    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);
        product.setColor("Black");

        Product product2 = new Product(2, "Mouse", "Asus Mouse", 100, 50, "Black");

        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println(product.getCode());

        System.out.println(product2.getCode());

    }
}
