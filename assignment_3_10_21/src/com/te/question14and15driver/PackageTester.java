package com.te.question14and15driver;

import com.te.question14and15.TestPackage;

public class PackageTester extends TestPackage{
	public static void main(String[] args) {
		PackageTester p = new PackageTester();
		System.out.println("Value of a is "+ p.a);
		p.hello();
		SamePackageClass s = new SamePackageClass();
		System.out.println("Value of b is "+ s.b);
		s.display();
	}
}
