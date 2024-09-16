package com.xworkz.impliments.runner;

import com.xworkz.impliments.examples.HosptialRule;

public class FortIsHosptial implements HosptialRule {
	

	    boolean maintainSilence() {
			System.out.println("running maintainSilence");
			return true;
		}

		 int serve() {
			System.out.println("running visitorAllowed");
			return 2;
		}
		
		 boolean Emergencyprotocol() {
			System.out.println("running serve");
			return true;
		}
}


