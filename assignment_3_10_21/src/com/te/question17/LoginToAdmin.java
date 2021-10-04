package com.te.question17;

public class LoginToAdmin {
		
		public void login(String user, String pwd) throws InvalidInputException {
			if(user.equalsIgnoreCase("admin")) {
				if(pwd.equalsIgnoreCase("admin123")) {
					System.out.println("Logged in Successful.");
				}else {
					throw new InvalidInputException("Wrong Password");
				}
			}else {
				throw new InvalidInputException("Wrong Credentials");
			}
		}
		
}
