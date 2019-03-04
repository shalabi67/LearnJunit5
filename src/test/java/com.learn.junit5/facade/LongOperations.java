package com.learn.junit5.facade;

public class LongOperations {
	public void timeOut() {
		try {
			Thread.sleep(100);
			System.out.println("Hello i am LongOperations::timeOut");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void timeOutLong() {
		try {
			Thread.sleep(5000);
			System.out.println("Hello i am LongOperations::timeOutLong");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
