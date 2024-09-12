package com.xworkz.Example.Polymorphism;

public class WheelChair extends Chair{
	public void Patient() {
		System.out.println("running Patient in WheelChair");
	}
	@Override
	public void Sit(){
		System.out.println("running sit in chair");
		
	}

}
