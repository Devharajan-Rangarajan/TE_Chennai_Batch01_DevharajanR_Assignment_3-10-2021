package com.te.question11;

import java.util.Arrays;

public class StringImplementation {
	
	public boolean equals(String s1, String s2) {
		int len;
		if( (len = s1.length()) == s2.length()) {
			
			char c1[] = s1.toCharArray();
			char c2[] = s2.toCharArray();
			int i = 0;
			while(len-- !=0) {
				if(c1[i] != c2[i]) {
					return false;					
				}
				i++;
			}
			return true;	
		}
		return false;
	}
	
	public String reverseString(String s) {
		char c1[] = s.toCharArray();
		int len = s.length();
		char c2[] = new char[len];
		int i = 0;
		while(len-- != 0)
		{
			c2[i] = c1[len];
			i++;
		}
		String ret = String.valueOf(c2);
		return ret;
	}
	
	public String changeCase(String s) {
		char c[] = s.toCharArray();
		int len = s.length();
		int i = 0;
		while(len-- != 0) {
			if(c[i]>=65 && c[i]<=90) {
				c[i] += 32;
			}else {
				c[i] -=32;
			}
			i++;
		}
		String ret = String.valueOf(c);
		return ret;
	}
	
}
