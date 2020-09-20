package com.demo.exceptions;

import com.demo.reader.Employee;

public class Main {
	
	public static void main(String[] args) {
		try {
			int a = 6;
			int b = 0; 
			int c = a/b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Khong nen chia cho 0");
		} catch (Exception e) {
			System.out.println(e.getCause());
		}
		
		//NullPointerException  1 a   b = 1D
//		Employee employee = findByID();
//		if (employee != null) {
//			System.out.println(employee.getId());
//		}
	}
}
