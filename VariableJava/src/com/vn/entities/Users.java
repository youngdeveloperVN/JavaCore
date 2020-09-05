package com.vn.entities;

public class Users {
	// is not variable
	private static String b = "Users";
	
	// instance variable
	private String username;
	protected String password;  // null
	int id; //=> 0
	boolean active;
	
	//class variable 
	private static String a = "A";

	public Users() {
		System.out.println("create new instance Users");
	}

	public Users(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	protected void setUsername(String username) {
		String prefix = null;
		this.username = username + prefix;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public static String getA() {
		return a;
	}

	public static void setA(String a) {
		Users.a = a;
	}

	public static String getB() {
		return b;
	}

	public void setId(int id) {
		this.id = id;
	}

	//Users is outer of InnerUser
	//InnerUser is inner of Users
//	private class InnerUser {
//		
//	}
	
	
}
