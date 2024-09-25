package com.xworkz.holiday.internal;


public class XTimeMachine extends TimeMachine {
	
	public XTimeMachine() {
		//chain
		
		System.out.println("no-arg const of XTimeMachine");
	}
	public void travelpast() {
		System.out.println("running travelpast in TimeMachine");

		System.out.println("overriding");
	
	}
	

}
