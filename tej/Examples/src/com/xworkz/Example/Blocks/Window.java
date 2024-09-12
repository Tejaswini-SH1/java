package com.xworkz.Example.Blocks;

public class Window {
	static int noofrods;
	static int noofdoors;
	
	static {
		noofrods=5;
		noofdoors=2;
		System.out.println("static block executed.");
	}
	
	public void display() {
		System.out.println("Displaying...");
		System.out.println("noofrods:"+noofrods);
		System.out.println("noofdoor:"+noofdoors);
	}

}
