package com.monocept.front;

import java.util.Scanner;

import com.monocept.middle.UserData;
import com.monocept.middle.UserRepository;

public class ConsoleLogin {
	public void loginViaConsole() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name");
		String uname = sc.nextLine();
		System.out.println("Enter password");
		String password = sc.nextLine();
		UserData userObj = new UserRepository().authenticate(uname, password);
		if (userObj != null)
			System.out.println("login pass");
		else
			System.out.println("login fail");

	}
}
