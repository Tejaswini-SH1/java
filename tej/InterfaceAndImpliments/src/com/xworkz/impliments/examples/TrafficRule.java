package com.xworkz.impliments.examples;

public interface TrafficRule {
	
	static boolean WearSeatBelts() {
		System.out.println("running wareseatbelt in trafficrule");
		return false;
	}
	static int ObeySpeedLimits() {
		System.out.println("running ObeySpeedLimits in trafficrule");
		return 0;
	}
	static boolean TrafficSignal() {
		System.out.println("running TrafficSignal in trafficrule");		
		return true;
	}
	static boolean StopSigns() {
		System.out.println("running StopSigns in trafficrule");
		return true;
	}
    static boolean YieldSigns() {
    	System.out.println("running YieldSigns in trafficrule");
		return false;
	}
	static boolean RightOfWay() {
		System.out.println("running RightOfWay in trafficrule");
		return false;
	}
	static boolean LeftRight() {
		System.out.println("running LeftRight in trafficrule");
		return false;
	}
	static boolean UseOfSeatBelts() {
		System.out.println("running UseOfSeatBelts in trafficrule");
		return true;
	}
	static boolean LaneUsage() {
		System.out.println("running LaneUsage in trafficrule");
		return false;
	}
	static String OverTaking() {
		System.out.println("running OverTaking in trafficrule");
		return null;
	}
	static String ParkingRegulations() {
		System.out.println("running ParkingRegulations in trafficrule");
		return null;
	}
	static String PedestrianAndBicycleRights() {
		System.out.println("running PedestrianAndBicycleRights in trafficrule");
		return null;
	}
	static String DrivingUnderInfluence() {
		System.out.println("running DrivingUnderInfluence in trafficrule");
		return null;
	}
	static boolean UseOfMobilePhones() {
		System.out.println("running UseOfMobilePhones in trafficrule");
		return false;
	}
	

}
