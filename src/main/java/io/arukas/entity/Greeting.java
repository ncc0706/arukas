package io.arukas.entity;

public class Greeting {

	private Long counter;
	
	private String message;

	public Long getCounter() {
		return counter;
	}

	public void setCounter(Long counter) {
		this.counter = counter;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Greeting(Long counter, String message) {
		super();
		this.counter = counter;
		this.message = message;
	}
	
}
