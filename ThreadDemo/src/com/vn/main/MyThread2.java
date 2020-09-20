package com.vn.main;

import java.util.List;

public class MyThread2 implements Runnable {

	public MyThread2(List<Integer> input) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

}
