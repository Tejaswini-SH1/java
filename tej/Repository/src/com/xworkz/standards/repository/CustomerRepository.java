package com.xworkz.standards.repository;

public interface CustomerRepository{
	
	void save();
	default int update() {
	return 0;
	
	}

}
