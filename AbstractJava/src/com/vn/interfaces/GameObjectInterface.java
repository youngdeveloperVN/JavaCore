package com.vn.interfaces;

public interface GameObjectInterface extends RenderInterface, GetBoundInterface {

	default void run() {
		System.out.println("Run");
	}

	static void run2() {
		System.out.println("Run");
	}

}
