package com.xworkz.service.reposirtory;

import com.xworkz.standards.repository.CustomerRepository;

public class CustomerServiceImp {
	private CustomerRepository customerRepository;
	
	public CustomerServiceImp(CustomerRepository customerRepository) {
		System.out.println("====");
		this.customerRepository=customerRepository;
	}
	
	public void run() {
		if(customerRepository!=null) {
			customerRepository.save();
		}
	}

}
