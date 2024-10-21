package com.xworkz.collections.runner;

import com.xworkz.collections.foodapp.FoodApp;

public interface FoodAppRunner {
	FoodApp foodApp=(String item) -> {
		System.out.println("Food App Item:"+item);
	}

}
