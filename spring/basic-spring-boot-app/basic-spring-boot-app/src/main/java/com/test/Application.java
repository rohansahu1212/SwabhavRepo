package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.monocept.GoodByService;
import com.swabhav.HowdyService;

@SpringBootApplication(scanBasePackages = {"com.monocept","com.swabhav"})
public class Application {

	public static void main(String[] args) {
		ApplicationContext cxt=   SpringApplication.run(Application.class);
		
		GoodByService sv1=(GoodByService) cxt.getBean("svc1");
		System.out.println(sv1.getMessage());
		
		GoodByService sv3=(GoodByService) cxt.getBean("svc1");
		System.out.println(sv3==sv1);
		
		HowdyService sv2=(HowdyService) cxt.getBean("svc2");
		System.out.println(sv2.getMessages());
		
		
		
		System.out.println("end of main");
	}

}
