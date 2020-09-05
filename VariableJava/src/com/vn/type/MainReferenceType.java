package com.vn.type;

public class MainReferenceType {
	
	static ReferenceType rtA = new ReferenceType();
	public static void main(String[] args) {
		// rtA: instance of ReferenceType
		rtA = new ReferenceType();
		rtA = update();
		ReferenceType rtB = rtA;
		System.out.println("Before chhange");
		System.out.println("a: =" + rtA.getA());
		System.out.println("b: =" + rtB.getA());
		rtB.setA(8);
		System.out.println("After chhange");
		System.out.println("a: =" + rtA.getA());
		System.out.println("b: =" + rtB.getA());
	}
	
	public static ReferenceType update() {
		rtA.setA(20);
		return rtA;
	}
	
}
