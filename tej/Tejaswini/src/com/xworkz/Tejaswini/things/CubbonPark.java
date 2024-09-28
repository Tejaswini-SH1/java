package com.xworkz.Tejaswini.things;

public class CubbonPark extends Park {
	
	
	@Override
	public void open()
	{
		System.out.println("running open in CubbonPark");
		
	}
	
	@Override
	public void close()
	{
		super.close(); //diff variables & methods from parent class
		System.out.println("running close in CubbonPark");
		
	}

}
