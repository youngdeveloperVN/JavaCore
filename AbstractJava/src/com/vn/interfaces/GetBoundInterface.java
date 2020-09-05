package com.vn.interfaces;

public interface GetBoundInterface {
	
	default void run() {
		System.out.println("Run");
	}
	
	static void run2() {
		System.out.println("Run");
	}
	
	void getBound();
	
}
