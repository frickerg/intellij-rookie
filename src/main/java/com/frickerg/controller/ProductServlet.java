package com.frickerg.controller;

import com.frickerg.model.Product;
import org.apache.velocity.Template;
import org.apache.velocity.tools.view.VelocityViewServlet;

import javax.naming.Context;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class ProductServlet extends VelocityViewServlet {

	ProductService service = new ProductService();

	@Override
	public Template handleRequest(
			HttpServletRequest request,
			HttpServletResponse response,
			Context context) throws Exception {

		List<Product> products = service.getProducts();
		context.put("products", products);

		return getTemplate("index.vm");
	}
}
