package com.te.question2;

public class DemoTypeCasting {
		public static void main(String[] args) {
			
			int i = 100;
		    long l = i; //no explicit type casting required
		    float f = l;  //no explicit type casting required
		    System.out.println("Int value : "+i);
		    System.out.println("Long value : "+l);
		    System.out.println("Float value : "+f);
		    /*Explicit type casting */
		    System.out.println("Float to Int value  :  "+ (int)f);
		    System.out.println("Long to Int value : "+ (int) l);
		}
}
