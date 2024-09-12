package com.xworkz.Example.Chaining;

public class Vehical {
	private int Vehicalno;
	private String source;
	private String destination;
	

	public Vehical(int busno, String source, String destination) {
		super();
		this.Vehicalno = Vehicalno;
		this.source = source;
		this.destination = destination;
	}


	public Vehical(int trainNo, String destination) {
		super();
		this.Vehicalno=Vehicalno;
		this.destination = destination;
	}
	
	public void display()
	{
		System.out.println("busno No:"+this.Vehicalno);
		System.out.println("Source:"+this.source);
		System.out.println("Destination :"+this.destination);
	}

}
