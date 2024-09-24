package com.xworkz.Repository.internal;

public class Printer {
	
	private boolean print=true;
	private String brand="HP";
	
	public boolean isPrint()
	{
		return this.print;
	}
	
	public String getbrand()
	{
		return this.brand;
	}
	
	private void setBrand()
	{
		this.brand=brand;
	}
	
	void setPrint(boolean print)
	{
		this.print=print;
	}

}
