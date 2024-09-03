package com.xworkz.practice.internal;

public class Gun extends Weapon {
	@Override
	public void use() {
		System.out.println("running use in Gun");
	}
	@Override
	public void fire() {
		System.out.println("running fire in weapon");
	}
	
	public void kill() {
		System.out.println("inovking a method");
		use();
		fire();
	}
	
	

}
