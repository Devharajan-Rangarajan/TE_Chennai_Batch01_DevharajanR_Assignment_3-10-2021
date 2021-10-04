package com.te.question4;

public class CheckPrime {

	public static void main(String args[]) {
		int i;
		int flag = 0;
		int n = 21;
		if (n == 0 || n == 1) {
			System.out.println(n + " is neither prime nor composite number");
		} else {
			for (i = 2; i <= n/2; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is prime number");
			}
		}
	}

}
