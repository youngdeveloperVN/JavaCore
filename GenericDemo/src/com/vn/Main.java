package com.vn;

public class Main {
	
	public static void main(String[] args) {
		
		Calculator<Integer> calculator = new Calculator<Integer>(4);
		Double d = calculator.sqrt();
		System.out.println(d);
	}
}
