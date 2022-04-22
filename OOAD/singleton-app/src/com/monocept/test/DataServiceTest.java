package com.monocept.test;

import com.monocept.model.DataService;

public class DataServiceTest {
	public static void main(String[] args) {
		DataService service1 = DataService.getInstance();
		DataService service2 = DataService.getInstance();
		DataService service3 = DataService.getInstance();
		DataService service4 = DataService.getInstance();

		Thread t1 = new Thread(() -> {
			DataService s1 = DataService.getInstance();
			s1.doWork1();
			s1.printMessage("thread 1");
		});

		Thread t2 = new Thread(() -> {
			DataService s1 = DataService.getInstance();
			s1.doWork2();
			s1.printMessage("thread 2");
		});

		Thread t3 = new Thread(() -> {
			DataService s1 = DataService.getInstance();
			s1.doWork3();
			s1.printMessage("thread 3");
		});

		t1.start();
		t2.start();
		t3.start();
	}

}
