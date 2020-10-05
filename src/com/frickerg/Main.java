package com.frickerg;

import com.frickerg.model.Product;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        final String test_product = "Test Product";
        final Product product = new Product(test_product);
        System.out.println(product.getName());
    }
}
