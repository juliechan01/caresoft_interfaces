package com.caresoft.clinicapp;

public class User {
	protected Integer id;
	protected int pin;
	
	// GET ID
	public Integer getId() {
		return id;
	}
	
	// SET ID
	public void setId(Integer id) {
		this.id = id;
	}
	
	// GET PIN
	public int getPin() {
		return pin;
	}
	
	// SET PIN
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	// CONSTRUCTOR
	public User(Integer id, int pin) {
		super();
		this.id = id;
		this.pin = pin;
	}
}
