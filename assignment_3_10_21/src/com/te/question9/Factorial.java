package com.te.question9;

public class Factorial {

	static int factorialCalculate(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorialCalculate(n - 1));
	}

	public static void main(String args[]){  
		  int fact = 1;  
		  int number = 4;//It is the number to calculate factorial    
		  fact = factorialCalculate(number);   
		  System.out.println("Factorial of "+number+" is: "+fact);    
	}
	
}
