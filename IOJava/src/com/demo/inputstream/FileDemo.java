package com.demo.inputstream;

import java.io.File;

public class FileDemo {
	
	static String FILE_PATH = "C:\\Users\\Huy\\git";
	
	public static void main(String[] args) {
		File file  = new File(FILE_PATH);
		
		//1. Exist ?
		System.out.println("File is exist: " + file.exists());
		
		//2. Check is 
		System.out.println("File is directory: " + file.isDirectory());
		
		//3. Get files in directory
		File[] files = file.listFiles();
		System.out.println("Files size : " + files.length);
	}
}
