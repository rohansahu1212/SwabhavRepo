package com.monocept.model;

public class Test {
	public static void main(String[] args) {
		AuthService auth=AuthService.getInstance();
		UserDTO dto=auth.getUser(3, "pgghss");
		System.out.println(dto);
	}
}
