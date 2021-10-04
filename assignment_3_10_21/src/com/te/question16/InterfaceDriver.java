package com.te.question16;

public class InterfaceDriver extends ClassAbstractImpl{

	@Override
	public void show() {
		System.out.println("Hello from Show");
		
	}
	public static void main(String[] args) {
		
		NewInterface ni = new InterfaceDriver();
		
		ni.display();
		ni.show();
				
		
	}


}
