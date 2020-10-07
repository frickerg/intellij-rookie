package com.frickerg.demo.notification;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class NotificationTest {

	private Notification notification;

	@Before
	public void setUp() throws Exception {
		this.notification = new Notification("message",new Date());
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getMessage() {
		assertEquals("message", this.notification.getMessage());
	}

	@Test
	public void setMessage() {
		String changeString = "new_message";
		this.notification.setMessage(changeString);

		System.out.println(this.notification.getMessage());
		assertEquals(changeString, this.notification.getMessage());
	}

	@Test
	public void getTimestamp() {
	}

	@Test
	public void setTimestamp() {
	}

	@Test
	public void testToString() {
	}

	@Test
	public void testEquals() {
	}

	@Test
	public void testHashCode() {
	}
}