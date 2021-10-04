package com.te.question10;

public class AbstractDriver extends AbstractOne{
	@Override
	public void display() {
		System.out.println("Hello from Display");
		
	}
	
	@Override
	public void show() {
		System.out.println("Hello from Show");
		
	}

	public static void main(String[] args) {
		
		AbstractOne a = new AbstractDriver();
		a.display();
		a.show();
	}


}
