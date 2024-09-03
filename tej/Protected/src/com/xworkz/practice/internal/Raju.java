package com.xworkz.practice.internal;

public class Raju {
	Weapon weapon=new Weapon();
	Gun gun=new Gun();
	
	public void Weapon() {
		System.out.println("running weapon in raju");
		weapon.use();
		weapon.fire();
	}
	
	public void Gun() {
		System.out.println("running gun in raju");
		gun.use();
		gun.fire();
		
	}

}
