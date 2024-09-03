package com.xworkz.practice.external;

import com.xworkz.practice.internal.Gun;
import com.xworkz.practice.internal.Weapon;

public class Ramesh {
	Weapon weapon=new Weapon();
	Gun gun=new Gun();
	
	public void Weapon() {
		System.out.println("running weapon in ramesh");
		weapon.use();
		weapon.fire();
	}
	
	public void Gun() {
		System.out.println("running gun in ramesh");
		gun.use();
		gun.fire();
		
	}


}
