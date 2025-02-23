package com.ty.beans;

public class Student {
	
	private String Name;
	private int Rollno;
	private Address address;
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getRollno() {
		return Rollno;
	}

	public void setRollno(int rollno) {
		Rollno = rollno;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	
	
	public void Display()
	{
		System.out.println("Name :"+Name);
		System.out.println("Rollno :"+Rollno);
		System.out.println("Address :"+address);
	}
}
