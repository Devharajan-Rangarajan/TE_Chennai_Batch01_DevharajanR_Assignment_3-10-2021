package com.te.question17;

public class InvalidInputException extends Exception{
	/**
	 * Checked Exception
	 */
	private static final long serialVersionUID = 1L;
	public InvalidInputException() {
	}
	public InvalidInputException(String message) {
		super(message);
	}
}
