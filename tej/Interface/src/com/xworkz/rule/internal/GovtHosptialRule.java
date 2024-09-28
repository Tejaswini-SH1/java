package com.xworkz.rule.internal;

public interface GovtHosptialRule extends HosptialRule,DoctorRule {
	public interface DoctorRule {

    boolean serve();
	
	}
}
