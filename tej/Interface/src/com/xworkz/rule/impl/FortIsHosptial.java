package com.xworkz.rule.impl;

import com.xworkz.rule.internal.GovtHosptialRule;

public class FortIsHosptial implements GovtHosptialRule{
	
	public FortIsHosptial() {
		super();
		System.out.println("running no-args const in FortIsHosptial");
		
	}
	

	@Override
	public boolean maintainSilence() {
		System.out.println("running maintainSilence");
		return true;
	}

	@Override
	public int visitorAllowed() {
		System.out.println("running visitorAllowed");
		return 2;
	}
	
	public boolean serve() {
		System.out.println("running serve");
		return true;
	}
}

