package com.vn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainStudent {

	public static void main(String[] args) {
		
		Student student1 = new Student("Hung1", 11);
		Student student2 = new Student("Hung2", 12);
		Student student3 = new Student("Hung3", 12);
		Student student4 = new Student("Hung4", 13);
		
		List<Student> students = new ArrayList<Student>(Arrays.asList(student3, student4, student1, student2));
		students.add(new Student("Hung5", 15));
		
		System.out.println("Before: " + students);
		Collections.sort(students);
		
		Collections.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return 0;
			}
			
		});
		
		System.out.println("After: " + students);
		
		
	}
}
