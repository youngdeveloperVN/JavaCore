package com.vn.type;

public class MainPrimitive {

	//args - prameter
	public static void main(String[] args) {
		int a = 10;
		int b = a;
		System.out.println("Before chhange");
		System.out.println("a: =" + a);
		System.out.println("b: =" + b);
		b = 8;
		System.out.println("After chhange");
		System.out.println("a: =" + a);
		System.out.println("b: =" + b);
	}
}
