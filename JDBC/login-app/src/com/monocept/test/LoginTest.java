package com.monocept.test;

import java.util.Scanner;

import com.monocept.front.ConsoleLogin;
import com.monocept.front.LoginUi;

public class LoginTest {
	public static void main(String[] args) {
		System.out.println("1- press 1 for UI login");
		System.out.println("2- press 2 for console login");
		Scanner sc = new Scanner(System.in);
		int loginChoice = sc.nextInt();
		if (loginChoice == 1)
			new LoginUi().loginFrame();
		if (loginChoice == 2)
			new ConsoleLogin().loginViaConsole();
		else
			System.out.println("invalid choice");
	}
}
