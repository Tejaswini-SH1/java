package com.xworkz.exception.runner;

import java.security.Provider.Service;

import com.xworkz.exception.internal.InvalidEmailException;
import com.xworkz.exception.internal.ServiceCheck;

public class Runner {
		public static void main(String[] args) throws ValidPasswordException, InvalidEmailException {
			Service service=new Service();
			service.run("tej@123");
				
		
		ServiceCheck servicecheck=new ServiceCheck();
		servicecheck.save("tej@gmail.com");
		servicecheck.AcceptPrice(20);
		
	}
	}


