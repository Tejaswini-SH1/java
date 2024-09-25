package com.xworkz.chaining.examples;

public class InternetProvider extends Provider {

	private Object LaunchDate;
	private Object cost;

	public InternetProvider(String name, String ceoname) {
		super(name, ceoname);
		this.cost=cost;
		this.LaunchDate=LaunchDate;

	
	}

	@Override
	public void service() {
		System.out.println("running service in InternetProvider");
		
	}

}
