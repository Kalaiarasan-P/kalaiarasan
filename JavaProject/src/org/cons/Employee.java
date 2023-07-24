package org.cons;

public class Employee { 
	
	// Non parameterized
	public Employee() {
    System.out.println("parent default constructor");
	}
	
	// Parameterized
	public Employee(float salary) {
		this();
    System.out.println("parent para consturtor"+salary);
	}

}
