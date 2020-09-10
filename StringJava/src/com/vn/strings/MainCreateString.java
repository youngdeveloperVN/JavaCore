package com.vn.strings;

public class MainCreateString {
	private String str = new String("ABC");

	public static void main(String[] args) {
		char chars[] = new char[] {'H', '2', 'O'};
//		String a = "ABC";
		
		String c = new String(chars);
		c = "H20 => H2 + 02";
		
		System.out.println(c);
		
		System.out.println(chars);
		
		
		
//		int inta[] = new int[2];
//		inta[0] = 1;
//		inta[1] = 1;
//		inta[2] = 1;
//		inta[4] = 1;
	}
}
