package com.te.question17;

public class InvalidCredentialsException extends RuntimeException{

	/**
	 * Unchecked Exception
	 */
	private static final long serialVersionUID = 1L;
	public InvalidCredentialsException() {
		super();
	}
	public InvalidCredentialsException(String message)	{
		super(message);
	}
	
}
