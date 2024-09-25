package com.xworkz.chaining.examples;

public class LenovoProvider extends Provider {

	public LenovoProvider(String name, String ceoname) {
		super(name, ceoname);
		
	}
	
	public void service() {
		System.out.println("running service in LenovoProvider");
	}

}
