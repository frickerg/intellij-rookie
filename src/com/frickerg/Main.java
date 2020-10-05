package com.frickerg;

import com.frickerg.model.Product;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        final Product product = new Product("Test Product");
        System.out.println(product.getName());
    }
}
