package com.xworkz.chaining.examples;

public class SatJioAirtelInternetProvider extends JioAirtelInternetProvider {
	public SatJioAirtelInternetProvider(String name, String ceoname) {
		super(name, ceoname);
		
	}

	private double cost;
	private String LaunchDate;

	public SatJioAirtelInternetProvider(double cost,String LaunchDate,String name, String ceoName) {

		super(name, ceoName);
		this.cost=cost;
		this.LaunchDate=LaunchDate;

	}
	
	@Override
	public void service() {
		System.out.println("running service in JioAirtelInternetProvider");
	}
	
	

}
