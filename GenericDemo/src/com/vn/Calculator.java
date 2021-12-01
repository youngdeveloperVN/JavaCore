package com.vn;

public class Calculator<T extends Number> {
	
	T value;
	
	Calculator(T value){
		this.value = value;
	}
	
	public Double sqrt() {
		double a = value.doubleValue();
		return Math.sqrt(a);
	}
	
}
