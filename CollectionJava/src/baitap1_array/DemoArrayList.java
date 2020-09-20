package baitap1_array;

import java.util.ArrayList;
import java.util.Collections;

public class DemoArrayList {
	
	public static void main(String[] args) {
		//GENERIC java
//		ArrayList<String> a = new ArrayList<String>();
//		a.add("a");
//		a.add("b");
//		a.add("bA");
//		a.add("BA");
//		a.add("AB");
//		Collections.sort(a);   //Asc
////		Collections.reverse(a); // desc
//		System.out.println(a);
		String input = "abcABC";
		byte[] inputByte = input.getBytes();
		for (byte b : inputByte) {
			System.out.println(b);
		}
		
	}
}
