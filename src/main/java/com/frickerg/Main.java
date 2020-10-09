package com.frickerg;

import com.frickerg.controller.ProductService;
import com.frickerg.controller.VelocityServlet;
import com.frickerg.model.Product;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import java.io.StringWriter;

public class Main {
	private static final Product product1 = new Product("Norco Sight C2 27,5\" yellow/black (2020)", "norco.jpg", 5939);
	private static final Product product2 = new Product("Ghost Nirvana Tour SF Advanced 27.5\" sky/dust (2020)", "ghost.jpg", 1999);
	private static final Product product3 = new Product("ORBEA Oiz M10 coral/black (2021)", "orbea.jpg", 4769);

	public static void main(String[] args) {
		ProductService productService = new ProductService();

		productService.addProduct(product1);
		productService.addProduct(product2);
		productService.addProduct(product3);

		VelocityEngine velocityEngine = new VelocityEngine();
		velocityEngine.init();

		Template t = velocityEngine.getTemplate("resources/index.vm");

		VelocityContext context = new VelocityContext();
		context.put("name", "World");

		StringWriter writer = new StringWriter();
		t.merge(context, writer);

		VelocityServlet servlet = new VelocityServlet();
	}
}
