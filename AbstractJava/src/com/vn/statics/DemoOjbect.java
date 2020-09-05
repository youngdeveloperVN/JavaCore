package com.vn.statics;

public class DemoOjbect {
	public static int a = 5;

	static {
		a = a + 5;
	}

	public DemoOjbect() {
		a = a * 2;
	}

	static void methodCountA() {
		a = a + 2;
	}

	public static void main(String[] args) {
		DemoOjbect demoOjbect = new DemoOjbect();
		demoOjbect.a = demoOjbect.a + 3;
		DemoOjbect.methodCountA();
		System.out.println(a);
	}
}
