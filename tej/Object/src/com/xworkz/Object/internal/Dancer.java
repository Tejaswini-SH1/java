package com.xworkz.Object.internal;

public class Dancer {
	public void use(Belt belt) {
		System.out.println("running use in dancer");
		belt.tie();
		
		if(belt instanceof LeatherBelt) {
			System.out.println("instanceof leather belt");
			LeatherBelt leatherBelt=(LeatherBelt)belt;
			leatherBelt.clip();
			
		}
	}

}
