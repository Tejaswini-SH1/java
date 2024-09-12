package com.xworkz.Example.Polymorphism;

public class Phone {
	private String brand;
	private double price;
	private String color;
	
	public Phone(String brand) {
		this.brand=brand;	
	}
	public Phone(double price) {
		this.price=price;
	}
	
    public Phone(String color,double price) {
    	this.color=color;
    	this.price=price;
    }
    
    public void Ring(String brand) {
    	System.out.println("running ring in phone");
    }
    public void Ring(double price) {
    	System.out.println("running ring in phone");
    }

}
