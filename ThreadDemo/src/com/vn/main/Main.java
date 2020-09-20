package com.vn.main;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		try {

			List<Integer> input = Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });

			MyThread myThread3 = new MyThread(input);
			myThread3.setName("myThread3");
			MyThread myThread = new MyThread(input);
			myThread.setName("myThread1");
			myThread3.join();
			myThread.run();
			myThread3.run();
//		myThread.stCart();
			myThread3.setPriority(Thread.NORM_PRIORITY);
			
			System.gc();

//		MyThread2  myThread2 = new MyThread2(input); 
//		myThread2.run();

			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
