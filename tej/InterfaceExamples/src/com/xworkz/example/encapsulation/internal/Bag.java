package com.xworkz.example.encapsulation.internal;

public class Bag {
	private boolean print=true;
	private String brand="American Tourist";
	
	public boolean isPrint(){
		return this.print;
	}
	
	private void setBrand() {
		this.brand=brand;
	}
	
	void setPrint(boolean print) {
		this.print= print;
	}
	

}
