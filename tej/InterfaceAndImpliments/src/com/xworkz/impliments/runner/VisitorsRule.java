package com.xworkz.impliments.runner;

import com.xworkz.impliments.examples.TempleRule;

public class VisitorsRule implements TempleRule {


	public boolean RemoveFootwear() {
		System.out.println("running removefootware in Dresscode");
		return false;
	}

	public boolean MaintainSilence() {
		System.out.println("running MaintainSilence in Dresscode");
		return false;
	}

	public boolean PurityAndCleanliness() {
		System.out.println("running PurityAndCleanliness in Dresscode");
		return false;
	}

	public String NoPhotographyOrVideography() {
		System.out.println("running NoPhotographyOrVideography in Dresscode");
		return null;
	}

	public String Offerings() {
		System.out.println("running Offerings in Dresscode");
		return null;
	}

	public boolean NoSmokingOrConsumptionOfAlcohol() {
		System.out.println("running NoSmokingOrConsumptionOfAlcohol in Dresscode");
		return false;
	}

	public boolean FollowTheQueue() {
		System.out.println("running FollowTheQueue in Dresscode");
		return false;
	}

	public boolean NoTouchingTheDeities() {
		System.out.println("running NoTouchingTheDeities in Dresscode");
		return false;
	}

	public boolean RespectForRitualsAndCustoms() {
		System.out.println("running RespectForRitualsAndCustoms in Dresscode");
		return false;
	}

}
