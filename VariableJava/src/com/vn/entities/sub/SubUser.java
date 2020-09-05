package com.vn.entities.sub;

import com.vn.entities.Users;

public class SubUser extends Users {

	public SubUser() {
		super();
		super.setUsername("4545");
		// error when private, default
//		super.password("4545");
		super.password = ("4545");
	}

	public SubUser(String username, String password) {
		//contructor
		super(username, password);
	}
	
	@Override
	public void setUsername(String username) {
		//method
		System.out.println("nOTHING");
	}
	
}
