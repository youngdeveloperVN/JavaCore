package com.vn;

/**
 * @author ngoch
 *
 */
public class Student implements Comparable<Student> {

	String name;
	Integer age;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		
		String name = o.getName();
		if(this.name.compareTo(name) == 0) {
			return -o.age.compareTo(this.age);
		} else {
			return this.name.compareTo(name);
		}
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]\n";
	}
	
	
	
}
