package com.xworkz.chaining.examples;

public class JioAirtelInternetProvider extends InternetProvider {

	public JioAirtelInternetProvider(String name, String ceoname) {
		super(name, ceoname);
		
	}
	
	@Override
	public void service() {
		System.out.println("running service in JioAirtelInternetProvider");
	}
	
	

}
