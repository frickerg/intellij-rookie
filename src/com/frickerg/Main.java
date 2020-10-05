package com.frickerg;

import com.frickerg.model.Product;

public class Main {

    private static String HELLO_WORLD = "Hello World";

    public static void main(String[] args) {
        System.out.println(HELLO_WORLD);

        final String testProduct = "Test Product";
        final Product product = new Product(testProduct);
        System.out.println(product.getName());
    }
}
