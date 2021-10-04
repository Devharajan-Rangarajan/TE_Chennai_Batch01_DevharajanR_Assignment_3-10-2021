package com.te.question11;

public class StringTest {

	public static void main(String[] args) {
		StringImplementation s = new StringImplementation();
		String s1 = "Hello";
		String s2 = "MYtestCase";
		System.out.println(s.equals(s1, s2));
		System.out.println(s.reverseString(s2));
		System.out.println(s.changeCase(s2));
	}

}
