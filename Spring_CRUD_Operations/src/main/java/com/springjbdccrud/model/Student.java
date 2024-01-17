package com.springjbdccrud.model;

public class Student {
    
	private int roll_number;
	
	@Override
	public String toString() {
		return "Student [roll_number=" + roll_number + ", name=" + name + ", address=" + address + "]";
	}

	private String name;
	
	private String address;

	public int getRoll_number() {
		return roll_number;
	}

	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
}
