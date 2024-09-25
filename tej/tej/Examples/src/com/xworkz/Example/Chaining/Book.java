package com.xworkz.Example.Chaining;

public class Book {
	private String brand;
	private double price;
	private String color;
	
	public Book(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	public Book(String brand, double price, String color) {
		this(brand,price);
		this.color = color;
	}
	
	
	public void details()
	{
		System.out.println("Brand:"+brand);
		System.out.println("Price:"+price);
		System.out.println("color:"+color);
		
		
	}
	

	
	

}
