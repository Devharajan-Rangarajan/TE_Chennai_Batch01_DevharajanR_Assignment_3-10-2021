package com.te.question7;

public class GcdCalculate {

		static int gcd(int a, int b)
	    {
	      if (b == 0)
	        return a;
	      return gcd(b, a % b);
	    }
	     
	    public static void main(String[] args)
	    {
	        int a = 11, b = 25;
	        System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b));
	    }

}
