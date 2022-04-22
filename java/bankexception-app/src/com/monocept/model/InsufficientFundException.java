package com.monocept.model;

public class InsufficientFundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private Account acc;
	private String detailMessage;

	InsufficientFundException(Account acc) {

		// super("name of account holder " + acc.getName() + " and id is " +
		// acc.getAccno()
//				+ " \n tries to withdraw money but only have " + acc.getBalance() + " but only have "
//				+ acc.withdraAmount);
		detailMessage = ("name of account holder " + acc.getName() + " and id is " + acc.getAccno()
				+ " \n tries to withdraw money but only have " + acc.getBalance() + " but only have "
				+ acc.withdraAmount);
		getMessage();

	}

	@Override
	public String getMessage() {
		return detailMessage;
	}
}
