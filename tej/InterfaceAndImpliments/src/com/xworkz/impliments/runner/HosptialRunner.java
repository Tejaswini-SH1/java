package com.xworkz.impliments.runner;

import com.xworkz.impliments.examples.HosptialRule;

public class HosptialRunner {

	public static void main(String[] args) {
		
		HosptialRule hosptialRule=new FortIsHosptial();
		HosptialRule.maintainSilence();
		HosptialRule.hygine();
		HosptialRule.Emergencyprotocol();

	}

}
