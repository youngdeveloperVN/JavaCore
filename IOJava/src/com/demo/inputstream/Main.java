package com.demo.inputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
	
	static final String FILE_INPUT = "C:\\Users\\Huy\\git\\Source File\\Demo Input.txt";
	public static void main(String[] args) throws IOException {
		
		File file = new java.io.File(FILE_INPUT);
		FileInputStream inputStream = new FileInputStream(file);
		
		byte[] bytesSize = new byte[1024 * 8 * 5]; 
//		int element = inputStream.read(bytesSize);
//		while(element != -1) {
//			System.out.print((char)element);
//			element = inputStream.read(bytesSize);
//		}
		inputStream.read(bytesSize);
		for (byte b : bytesSize) {
			System.out.print((char) b);
		}
	}
	//Appache IO
}
