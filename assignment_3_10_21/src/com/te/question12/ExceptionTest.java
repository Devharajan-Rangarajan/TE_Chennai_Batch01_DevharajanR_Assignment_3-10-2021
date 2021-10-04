package com.te.question12;

public class ExceptionTest {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		try {
			try {
				int a = 10;
				int b = 0;
				int c = a / b;
				System.out.println(c);
			} catch (ArithmeticException e) {
				System.out.println("Divide by zero not possible");
			}
			System.out.println("This is executed");
			String name = null;
			System.out.println(name.length());
		} catch (NullPointerException e) {
			System.out.println("You cannot find length of a NULL string");
			// e.printStackTrace();
			e.fillInStackTrace();
			e.printStackTrace();
		}

	}

}
