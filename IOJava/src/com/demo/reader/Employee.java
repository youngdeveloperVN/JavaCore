package com.demo.reader;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private int age;
	private int salary;

	public String getId() {
		return id;
	}
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.showType(Employee.class);
		
		Integer a = new Integer(5);
		int b = a.intValue();   // Not autoboxing
//		int b = a;   // Autoboxing  
//		int => Integer   // Boxing
//		Integer => int // UnBoxing		
		
		System.out.println(employee.toString());
	}
	 
	public void showType(Class<?> type) {
		System.out.println(type);
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
