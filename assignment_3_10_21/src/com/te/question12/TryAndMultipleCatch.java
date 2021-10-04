package com.te.question12;

public class TryAndMultipleCatch {
	
		public static void main(String[] args) {
		
		try {
			ExceptionTest exception = (ExceptionTest) Class.forName("com.te.ExceptionTest.ExceptionTest")
										.newInstance();
			System.out.println(exception.toString());
		} catch (InstantiationException e) {
			
			e.printStackTrace();
			
		} catch (IllegalAccessException e) {
			
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

	}
	
}
