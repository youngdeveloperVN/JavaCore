package com.demo.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class MainReader {
	
	static final String FILE_INPUT = "C:\\Users\\Huy\\git\\Source File\\csvfile.csv";
	public static void main(String[] args) {
		getEmployeeFromCSVFile(FILE_INPUT);
		System.out.println("Done!");
	}
	
	static List<Employee> getEmployeeFromCSVFile(String file){
		List<Employee> result = new ArrayList<Employee>();
		try {
			//1. Read file by line
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				//2. Convert line to object
				String[] strings = line.split(",");
				Employee employee = new Employee();
				employee.setId(strings[0]);
				employee.setName(strings[1]);
				
				//3.add list
				result.add(employee);
			}
			System.out.println(result.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
