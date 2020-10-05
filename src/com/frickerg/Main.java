package com.frickerg;

import com.frickerg.model.Product;

public class Main {

    public static void main(String[] args) {
        final String helloWorld = "Hello World";
        System.out.println(helloWorld);

        final String testProduct = "Test Product";
        final Product product = new Product(testProduct);
        System.out.println(product.getName());
    }
}
