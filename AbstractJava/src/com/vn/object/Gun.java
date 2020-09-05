package com.vn.object;

import com.vn.consts.Constance;
import com.vn.interfaces.GameObjectInterface;

/**
 * @author Huy
 *
 */
public class Gun extends GameOjbect implements GameObjectInterface {
	private final static String NAME_OBJECT = "GUN";
	
	public Gun() {
		super();
	}
	
	
	@Override
	public void render() {
		final int a;
		for (int i = 0; i < 10; i++) {
		}
		System.out.println("Gun render");
		
	}

	@Override
	public void getBound() {
		
	}
	
//	@Override
//	public void run() {
//		System.out.println("Gun Run");
//	}

	public static void main(String[] args) {
		Gun gun = new Gun();
		gun.run();
	}
	

}
