package com.app.exception;

public class AccountNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public AccountNotFoundException() {
		super();
	}
   
	public AccountNotFoundException(String msg) {
		super(msg);
	}
}
