package com.xworkz.example.interfaces;

public interface Zudio {
	
	void saveData();
	
	default int update() {
		return 2;
	}
	

}
