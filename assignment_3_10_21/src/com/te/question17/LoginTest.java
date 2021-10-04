package com.te.question17;

import java.util.Scanner;

public class LoginTest {
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter UserName : ");
			String user = sc.next();
			System.out.println("Enter Password: ");
			String pwd = sc.next();
			sc.close();
			LoginToAdmin l = new LoginToAdmin();
			try {
				l.login(user, pwd);
			} catch (InvalidInputException e) {
				System.out.println(e.getMessage());
			}
		}
	
}
