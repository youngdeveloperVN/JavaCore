package com.vn.type;

import com.vn.entities.Users;

public class MainUser {
	
	public static void main(String[] args) {
		// users is instance of Users
		Users users = new Users();
		
		Users user2 = new Users();
		
		System.out.println(users.getPassword());
		System.out.println(user2.getId());
	}
}
