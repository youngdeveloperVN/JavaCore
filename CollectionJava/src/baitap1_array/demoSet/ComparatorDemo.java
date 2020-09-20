package baitap1_array.demoSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author Huy
 * 
 */
@Author
public class ComparatorDemo {

	public static void main(String[] args) {
		List<Employee> empls = new ArrayList<Employee>();
		empls.add(new Employee("1", "Hung", 14, 11));
		empls.add(new Employee("1", "Huy", 13, 11));
		empls.add(new Employee("1", "Nam", 13, 14));
		empls.add(new Employee("1", "Thuy", 12, 7));
		empls.add(new Employee("1", "Hoang", 15, 14));
		
		Collections.sort(empls, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				//age //salary
				int compareByAge = o1.getAge().compareTo(o2.getAge());
				int compareBySalary = o1.getSalary() <= o2.getSalary() ? -1 : 1;
				if(compareByAge != 0 ) {
					return compareByAge;
				} else {
					return - compareBySalary;
				}
			}
		});
		for (Employee employee : empls) {
			System.out.println(employee);
		}
	}

}
