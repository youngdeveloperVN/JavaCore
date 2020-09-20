package baitap1_array;

import java.util.Set;
import java.util.TreeSet;

public class DemoTreeSet {
	public static void main(String[] args) {
		Set a = new TreeSet<Integer>();
		a.add(5);
		a.add(2);
		a.add(3);
		a.add(4);	
		a.add(4);
		a.add(6);
		System.out.println(a);
	}
}
