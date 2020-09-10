package com.vn.strings;

public class StringSplit {
	static String x = "ABC";
	public static void main(String[] args) {
		Float a = new Float(0.45666666f);
		String b = String.valueOf(a);  //0.45666666
		String[] bArray = b.split("\\."); 
		System.out.println(bArray[1].length() + x);
	}
	
	private static void abc() {
		System.out.println(x);
	}
	
	private static void abc2() {
		System.out.println(x);
	}
}
