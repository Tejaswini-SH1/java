package com.xworkz.example.encapsulation.internal;

import java.awt.print.Book;

public class Runner {

	public static void main(String[] args) {
		Bag bag=new Bag();
		bag.isPrint();
		System.out.println("bag running in runner");
		
		Things things=new Things();
		things.takePrintOut();
		System.out.println("things running in runner");
		
		things.getbag();
		System.out.println("getbag running in runner");
		
		
}

}
