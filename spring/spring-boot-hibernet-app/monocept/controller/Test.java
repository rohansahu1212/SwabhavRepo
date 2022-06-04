package com.monocept.controller;

import com.monocept.service.StudentService;

public class Test {
	public static void main(String[] args) {
		System.out.println(new StudentService().getSingle(42));
	}

}
