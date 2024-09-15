package com.xworkz.chaining.examples;

public  class DellProvider extends Provider {

	public DellProvider(String name, String ceoname) {
		super(name, ceoname);
	
	}

	public void service() {
		System.out.println("running service in DellProvider");
	}
	

	}
	
