package com.monocept.subscriber;

import com.monocept.publisher.Account;
import com.monocept.publisher.Notifier;

public class EmailNotifier implements Notifier {

	@Override
	public void notify(Account acc) {
		System.out.println("E-mail notification");
		System.out.println("Hey " + acc.getName() + ", transection ouccer in your account and "
				+ "your vailable balance in " + acc.getBalance());
		System.out.println("----------------");
		
	}

}
