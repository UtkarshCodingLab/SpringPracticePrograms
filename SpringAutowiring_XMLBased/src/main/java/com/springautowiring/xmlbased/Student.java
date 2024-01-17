package com.springautowiring.xmlbased;

public class Student {
    private int roll_number;
    
    private String name;
    
    private Address address;

	
	public Student(Address address) {
		super();
		System.out.println("Injected through Constructor");
		this.address = address;
	}

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Injected Through Setter Method");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [roll_number=" + roll_number + ", name=" + name + ", address=" + address + "]";
	}

    
    
}
