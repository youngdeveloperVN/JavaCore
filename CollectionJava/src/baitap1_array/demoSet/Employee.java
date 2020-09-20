package baitap1_array.demoSet;

public class Employee implements Comparable<Employee> {

	private String id;
	private String name;
	private int age;
	private int salary;

	public Employee(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Employee(String id, String name, int age, int salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
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
	public int compareTo(Employee obj2) {
		if (obj2.getAge() == this.age && obj2.getName() == this.name)
			return 0;
		else {
			return obj2.getAge().compareTo(this.age);
		}
	}

	@Override
	public int hashCode() {
		int hashcode = 0;
		hashcode = age * 20;
		hashcode += name.hashCode();
		return hashcode;
	}

	@Override
	public boolean equals(Object obj) {
		Employee obj2 = (Employee) obj;
		if (obj2.getAge() == this.age && obj2.getName() == this.name)
			return true;
		return false;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	
}
