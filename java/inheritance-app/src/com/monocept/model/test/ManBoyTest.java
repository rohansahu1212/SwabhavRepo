package com.monocept.model.test;

import com.monocept.model.Boy;
import com.monocept.model.Infant;
import com.monocept.model.Kid;
import com.monocept.model.Man;

public class ManBoyTest {
	public static void main(String[] args) {
		System.out.println("Output from case study 1 ------------------");
		caseStudy1();

		System.out.println("Output from case study 2 ------------------");
		caseStudy2();

		System.out.println("Output from case study 3 ------------------");
		caseStudy3();

		System.out.println("Output from case study 4 ------------------");
		caseStudy4();
    
		System.out.println("Output from case study 5 ------------------");
		caseStudy5();
		
	}

	private static void caseStudy1() {
		Man x;
		x = new Man();
		x.read();
		x.play();
	}

	private static void caseStudy2() {
		Boy y;
		y = new Boy();
		y.play();
		y.eat();
		y.read();
	}

	private static void caseStudy3() {
		Man x;
		x = new Boy();
		x.read();
		x.play();
	}

	private static void caseStudy4() {
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Kid());
		atThePark(new Infant());

	}

	private static void atThePark(Man m) {
		System.out.println("At the park");
		System.out.println(m.getClass());
		m.play();
	}
	private static void caseStudy5() {
		Object x;
		x=new Man();
		System.out.println(x.getClass());
	}

}
