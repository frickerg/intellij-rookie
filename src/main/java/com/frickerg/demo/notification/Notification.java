package com.frickerg.demo.notification;

import java.util.Date;
import java.util.Objects;

public class Notification {

	private String message;
	private Date timestamp;

	public Notification() {
		// do nothing
	}

	public Notification(String message, Date timestamp) {
		this.message = message;
		this.timestamp = timestamp;

		System.out.println("generated notification: " + this.toString());

		showText("asdf", "ghjkl");
	}

	private void showText(String string1, String string2) {
		System.out.println(string1);
		System.out.println(string2);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	@Override public String toString() {
		return "Notification{" + "message='" + message + '\'' + ", timestamp=" + timestamp + '}';
	}

	@Override public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Notification that = (Notification) o;
		return message.equals(that.message) && timestamp.equals(that.timestamp);
	}

	@Override public int hashCode() {
		return Objects.hash(message, timestamp);
	}
}
