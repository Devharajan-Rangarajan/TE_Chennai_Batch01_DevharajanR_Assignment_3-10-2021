package com.te.question8;

import java.util.Scanner;

public class BankImpl {

	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		// create initial accounts
		System.out.print("How many number of customers do you want to input? ");
		int n = sc.nextInt();
		BankDetails [] c = new BankDetails[n];
		for (int i = 0; i < c.length; i++) {
			c[i] = new BankDetails();
			c[i].openAccount();
		}
		// loop runs until number 5 is not pressed to exit
		int ch;
		do {
			System.out.println("\n ***Banking System Application***");
			System.out.println( "1. Display all account details \n 2. Search by Account number\n "
					+ "3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");
			System.out.println("Enter your choice: ");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				for (int i = 0; i < c.length; i++) {
					c[i].showAccount();
				}
				break;
			case 2:
				System.out.print("Enter account no. you want to search: ");
				String ac_no = sc.next();
				boolean found = false;
				for (int i = 0; i < c.length; i++) {
					found = c[i].search(ac_no);
					if (found) {
						break;
					}
				}
				if (!found) {
					System.out.println("Search failed! Account doesn't exist..!!");
				}
				break;
			case 3:
				System.out.print("Enter Account no. : ");
				ac_no = sc.next();
				found = false;
				for (int i = 0; i < c.length; i++) {
					found = c[i].search(ac_no);
					if (found) {
						c[i].deposit();
						break;
					}
				}
				if (!found) {
					System.out.println("Search failed! Account doesn't exist..!!");
				}
				break;
			case 4:
				System.out.print("Enter Account No : ");
				ac_no = sc.next();
				found = false;
				for (int i = 0; i < c.length; i++) {
					found = c[i].search(ac_no);
					if (found) {
						c[i].withdrawal();
						break;
					}
				}
				if (!found) {
					System.out.println("Search failed! Account doesn't exist..!!");
				}
				break;
			case 5:
				System.out.println("See you soon...");
				break;
			default:
				System.out.println("Invalid Choice Try Again!!!");
			}
		} while (ch != 5);
		sc.close();
	}

}
