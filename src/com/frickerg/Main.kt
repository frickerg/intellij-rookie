package com.frickerg

import com.frickerg.model.Product

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val helloWorld = "Hello World"
        println(helloWorld)
        val testProduct = "Test Product"
        val product = Product(testProduct)
        println(product.name)
    }
}