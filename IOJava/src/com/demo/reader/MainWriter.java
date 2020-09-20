package com.demo.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MainWriter {
	
	static final String FILE_INPUT = "C:\\Users\\Huy\\git\\Source File1\\csvfile1.csv";
	public static void main(String... args) throws IOException {
		String input = "\n1,Tung\n5,Hung";
		Files.write(Paths.get(FILE_INPUT), input.getBytes(), 
				StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		System.out.println("Done!");
	}
}
