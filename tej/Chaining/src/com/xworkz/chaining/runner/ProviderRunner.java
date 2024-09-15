package com.xworkz.chaining.runner;

import com.xworkz.chaining.examples.AirtelInternetProvider;
import com.xworkz.chaining.examples.BookingProvider;
import com.xworkz.chaining.examples.DellProvider;
import com.xworkz.chaining.examples.ExtremeAirtelInternetProvider;
import com.xworkz.chaining.examples.Fast5gExtreme;
import com.xworkz.chaining.examples.InternetProvider;
import com.xworkz.chaining.examples.LenovoProvider;
import com.xworkz.chaining.examples.Provider;


public class ProviderRunner {

	public static void main(String[] args) {
		Provider provider=new BookingProvider("Channu","Laxmi");
		provider.service();
		provider.equals(provider);
		provider.toString();
		System.out.println(provider.toString());
		System.out.println("==============");
		
		Provider provider1=new LenovoProvider("Sandya","Abhi");
		provider1.service();
		provider1.equals(provider1);
		provider1.toString();
		System.out.println(provider1.toString());
		System.out.println("==============");
		
		Provider provider3=new DellProvider("Nidhi","Shree");
		provider3.service();
		provider3.equals(provider3);
		provider3.toString();
		System.out.println(provider3.toString());
		System.out.println("============");

		
		Provider provider2=new InternetProvider("Bhagya","Tej");
		provider2.service();
		provider2.equals(provider2);
		provider2.toString();
		System.out.println(provider2.toString());
		System.out.println("==============");
		
		
		Provider provider4=new AirtelInternetProvider("Sush","Kiran");
		provider4.service();
		provider4.equals(provider2);
		provider4.toString();
		System.out.println(provider4.toString());
		System.out.println("==============");
		
		Provider provider5=new ExtremeAirtelInternetProvider("Prii","Priyanka");
		provider5.service();
		provider5.equals(provider5);
		provider5.toString();
		System.out.println(provider5.toString());
		System.out.println("==============");
		
		Provider provider6=new Fast5gExtreme(0, "Jerry","Tom", null);
		provider6.service();
		provider6.equals(provider6);
		provider6.toString();
		System.out.println(provider6.toString());
		System.out.println("==============");
		
		Provider provider7=new Fast5gExtreme(0, "Teju", "Heeni", null);
		provider7.service();
		provider7.equals(provider7);
		provider7.toString();
		System.out.println(provider7.toString());
		System.out.println("==============");
		
		Provider provider8=new Fast5gExtreme(12563, "nov 25", "vani", "vinutha");
		provider8.service();
		provider8.equals(provider8);
		provider8.toString();
		System.out.println(provider8.toString());
		System.out.println("==============");
		}
	
	

}
