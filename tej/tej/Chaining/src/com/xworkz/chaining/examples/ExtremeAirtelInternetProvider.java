package com.xworkz.chaining.examples;

public class ExtremeAirtelInternetProvider extends InternetProvider{

	public ExtremeAirtelInternetProvider(String name, String ceoname) {
		super(name, ceoname);
		
	}
	

		@Override
		public void service() {
			System.out.println("running service in InternetProvider");
			
		}
	}
	

