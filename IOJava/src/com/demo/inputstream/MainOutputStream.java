package com.demo.inputstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MainOutputStream {
	
	static final String FILE_INPUT = "C:\\Users\\Huy\\git\\Source File\\Demo Output.txt";
	public static void main(String[] args) throws IOException {
		
		File file = new java.io.File(FILE_INPUT);
		OutputStream outputStream = new FileOutputStream(file);
		
		outputStream.write("Hello".getBytes());
		outputStream.write("Huy".getBytes());
		
		outputStream.close();
		System.out.println("Done!");
	}
}
