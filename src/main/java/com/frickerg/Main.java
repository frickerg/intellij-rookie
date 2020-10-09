package com.frickerg;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import java.io.StringWriter;

public class Main {

	public static void main(String[] args) {
		VelocityEngine velocityEngine = new VelocityEngine();
		velocityEngine.init();

		Template t = velocityEngine.getTemplate("resources/index.vm");

		VelocityContext context = new VelocityContext();
		context.put("name", "World");

		StringWriter writer = new StringWriter();
		t.merge(context, writer);
	}
}
