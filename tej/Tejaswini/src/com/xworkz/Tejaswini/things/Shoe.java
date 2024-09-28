package com.xworkz.Tejaswini.things;

public class Shoe {
	
		
		private String brand;
		private String color;
		private double cost;
		private int size;
		
		public Shoe(String brand, String color)
		{
			super();
			this.brand=brand;
			this.color=color;
			System.out.println("running String,String const of shoe");
			
		}
		public Shoe(String brand, String color, double cost, int size)
		{
			this(brand, color);
			this.cost=cost;
			this.size=size;
			System.out.println("running String,String const of shoe");
			
		}
		
		public void dispaly()
		{
			System.out.println("Brand:"+this.brand);
		}

	}

