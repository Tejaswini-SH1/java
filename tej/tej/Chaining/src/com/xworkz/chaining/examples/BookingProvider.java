package com.xworkz.chaining.examples;

public  class BookingProvider extends Provider {

	public BookingProvider(String name, String ceoname) {
		super(name, ceoname);
		System.out.println("con of bookingprovider");
	}

	public void service() {
		System.out.println("running service in BookingProvider");
	}
	
	
}
	

