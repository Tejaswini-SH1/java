package com.xworkz.example.encapsulation.internal;

public class Things {
	
	Bag bag=new Bag();
	public Bag getbag()
	{
		System.out.println("running in a things");
		return this.bag;
	}
	
	public void takePrintOut() {
		System.out.println("prinetr.getBrand");
	}
	

}
