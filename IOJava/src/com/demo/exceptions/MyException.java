package com.demo.exceptions;

public class MyException extends RuntimeException {
	
	public static void main(String[] args) {
		throw new MyException("Thich thi throw");
	}
	
	public MyException(String message){
		throw new RuntimeException(message);
	}
}
