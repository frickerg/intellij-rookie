package com.frickerg.controller;

import com.frickerg.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

	private final List<Product> productList;

	public ProductService() {
		this.productList = new ArrayList<Product>();
	}

	public void addProduct(Product product) {
		this.productList.add(product);
	}

	public List<Product> getProducts() {
		return this.productList;
	}
}
