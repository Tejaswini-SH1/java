package com.xworkz.example.interfaces.service;

import com.xworkz.example.interfaces.Zudio;

public class ZudioService {
	
	private ZudioService zudioService;
	private Zudio zudio;
	public ZudioService(Zudio zudio)
	{
		super();
		this.zudio = zudio;
		
	}
	
	public void run() {
		if(zudio!=null) {
			zudio.saveData();
		}
	}
	

}
