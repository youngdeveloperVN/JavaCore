package baitap1_array.demoSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainSetEmployee {
	public static void main(String[] args) {
		// Set with Integer
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(4);
		nums.add(4);
		nums.add(4);
		Set<Integer> setNums = new HashSet<Integer>(nums);
		System.out.println(setNums.size());

		// Set with Employee
		List<Employee> empls = new ArrayList<Employee>();
		empls.add(new Employee("Huy", 13));
		empls.add(new Employee("Huy", 14));
		empls.add(new Employee("Huy", 13));
		System.out.println(empls.size());
		Set<Employee> set = new HashSet<Employee>(empls);
		System.out.println(set.size());
		for (Employee employee : set) {
			System.out.println(employee);
		}
	}
	
}
