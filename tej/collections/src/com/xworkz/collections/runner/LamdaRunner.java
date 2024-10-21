package com.xworkz.collections.runner;

import com.xworkz.collections.functional.Starter;
import com.xworkz.collections.usage.Labour;

public class LamdaRunner {

	public static void main(String[] args) {
		Starter starter()->{
		System.out.println("running main in lamdarunner");
	};
	
	Labour labour=new Labour();
	labour.startMotor(starter);
}

	
	
}
