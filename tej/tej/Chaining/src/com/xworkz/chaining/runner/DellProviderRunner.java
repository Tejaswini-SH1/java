package com.xworkz.chaining.runner;

import com.xworkz.chaining.examples.DellProvider;
import com.xworkz.chaining.examples.Provider;

public class DellProviderRunner {

	public static void main(String[] args) {
		Provider provider1=new DellProvider("Nidhi","Shree");
		provider1.service();
		provider1.equals(provider1);
		provider1.toString();
		System.out.println("============");

	}

}
