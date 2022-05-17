package com.monocept.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.monocept.service.StudentService;

public class StudentTest {
	public static void main(String[] args) {
		ApplicationContext cxt= new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(cxt.getClass());
		
		StudentService sv1=cxt.getBean("studentSvc",StudentService.class);
		System.out.println(sv1.count());
		System.out.println(sv1.hashCode());
		
		StudentService sv2=cxt.getBean("studentSvc",StudentService.class);
		System.out.println(sv2.count());
		System.out.println(sv2.hashCode());
	}

}
