package com.xworkz.impliments.runner;

import com.xworkz.impliments.examples.RailwayStationRule;

public class Policies implements RailwayStationRule {

	public int TicketPurchaseAndValidation() {
		System.out.println("running TicketPurchaseAndValidation in RailwayStationRule");
		return 0;
	}

	public boolean PlatformEntryAndExit() {
		System.out.println("running PlatformEntryAndExit in RailwayStationRule");
		return false;
	}

	public String NoLoitering() {
		System.out.println("running NoLoitering in RailwayStationRule");
		return null;
	}

	public boolean RespectSecurityChecks() {
		System.out.println("running RespectSecurityChecks in RailwayStationRule");
		return false;
	}

	public int QueueSystem() {
		System.out.println("running QueueSystem in RailwayStationRule");
		return 0;
	}

	public boolean NoSmoking() {
		System.out.println("running NoSmoking in RailwayStationRule");
		return false;
	}

	public boolean LuggageRestrictions() {
		System.out.println("running LuggageRestrictions in RailwayStationRule");
		return false;
	}

	public String RespectAnnouncements() {
		System.out.println("running RespectAnnouncements in RailwayStationRule");
		return null;
	}

	public String BoardingAndAlighting() {
		System.out.println("running BoardingAndAlighting in RailwayStationRule");
		return null;
	}

	public boolean NoCrossingOfTracks() {
		System.out.println("running NoCrossingOfTracks in RailwayStationRule");
		return false;
	}

	public boolean KeepTheStationClean() {
		System.out.println("running KeepTheStationClean in RailwayStationRule");
		return false;
	}

	public boolean BeMindfulOfEmergencyExits() {
		System.out.println("running BeMindfulOfEmergencyExits in RailwayStationRule");
		return false;
	}

	public String NoUnauthorizedVendors() {
		System.out.println("running NoUnauthorizedVendors in RailwayStationRule");
		return null;
	}

	public boolean RespectPublicAndPrivateProperty() {
		System.out.println("running RespectPublicAndPrivateProperty in RailwayStationRule");
		return false;
	}

	public String NoLoudOrDisruptiveBehavior() {
		System.out.println("running NoLoudOrDisruptiveBehavior in RailwayStationRule");
		return null;
	}

}
