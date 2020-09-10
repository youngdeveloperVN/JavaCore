package com.vn.strings;

public class StringLiteralAndStringNew {
	
	public static void main(String[] args) {
		String string1 = "Hello String!";
		String string2 = "Hello String!";
		System.out.println("Literal : " + string2.equals(string1));
		
		String string3 = new String("Hello String!");
		System.out.println("String New : " + string2.equals(string3));
	}
}	
