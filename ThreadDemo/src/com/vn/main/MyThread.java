package com.vn.main;

import java.util.List;

public class MyThread extends Thread {
	List<Integer> input;
	
	public MyThread(List<Integer> input) {
		this.input = input;
	}

	@Override
	public void run() {
		for (int i = 0; i < input.size(); i++) {
			System.out.println(this.getName() + " : " + input.get(i));
			if(i == 3 ) {
				try {
					Thread.sleep(1000L);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
}
