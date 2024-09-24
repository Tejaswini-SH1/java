package com.xworkz.Repository.internal;

public class Staff {
	
	Printer printer=new Printer();
	
	public Printer getPrinter()
	{
		return this.printer;
	}
	
	public void takePrinterOut()
	{
		System.out.println("printer.getBrand");
	}

}
