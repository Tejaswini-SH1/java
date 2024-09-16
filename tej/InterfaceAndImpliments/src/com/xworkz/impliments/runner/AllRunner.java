package com.xworkz.impliments.runner;

import com.xworkz.impliments.examples.BankRule;
import com.xworkz.impliments.examples.CollegeRule;
import com.xworkz.impliments.examples.HosptialRule;
import com.xworkz.impliments.examples.RailwayStationRule;
import com.xworkz.impliments.examples.TempleRule;
import com.xworkz.impliments.examples.TrafficRule;

public class AllRunner {

	public static void main(String[] args) {
		
		HosptialRule hosptialrule=new FortIsHosptial();
		HosptialRule.hygine();
		HosptialRule.Emergencyprotocol();
		HosptialRule.serve();
		System.out.println("==========");
		
		TrafficRule trafficRule=new SignalLight();
		TrafficRule.WearSeatBelts();
		TrafficRule.ObeySpeedLimits();
		TrafficRule.TrafficSignal();
		TrafficRule.StopSigns();
		TrafficRule.YieldSigns();
		TrafficRule.RightOfWay();
		TrafficRule.LeftRight();
		TrafficRule.UseOfSeatBelts();
		TrafficRule.LaneUsage();
		TrafficRule.OverTaking();
		TrafficRule.ParkingRegulations();
		TrafficRule.PedestrianAndBicycleRights();
		TrafficRule.DrivingUnderInfluence();
		TrafficRule.UseOfMobilePhones();
		System.out.println("==========");
		
		
		CollegeRule CollegeRule=new AcademicRules();
		CollegeRule.AcademicIntegrity();
		CollegeRule.RespectfulConduct();
		CollegeRule.DressCode();
		CollegeRule.UseOfElectronicDevices();
		CollegeRule.SubstanceFreeCampus();
		CollegeRule.PropertyRespect();
		CollegeRule.ExaminationRules();
		CollegeRule.HealthAndSafetyCompliance();
		CollegeRule.ClubAndExtracurricularActivities();
		CollegeRule.Punctuality();
		
		TempleRule templerule=new VisitorsRule();
		TempleRule.DressCode();
		TempleRule.RemoveFootwear();
		TempleRule.MaintainSilence();
		TempleRule.PurityAndCleanliness();
		TempleRule.NoPhotographyOrVideography();
		TempleRule.Offerings();
		TempleRule.NoSmokingOrConsumptionOfAlcohol();
		TempleRule.FollowTheQueue();
		TempleRule.NoTouchingTheDeities();
		TempleRule.RespectForRitualsAndCustoms();

		RailwayStationRule railwayStationRule=new Policies();
		RailwayStationRule.TicketPurchaseAndValidation();
		RailwayStationRule.PlatformEntryAndExit();
		RailwayStationRule.NoLoitering();
		RailwayStationRule.RespectSecurityChecks();
		RailwayStationRule.QueueSystem();
		RailwayStationRule.NoSmoking();
		RailwayStationRule.LuggageRestrictions();
		RailwayStationRule.RespectAnnouncements();
		RailwayStationRule.BoardingAndAlighting();
		RailwayStationRule.NoCrossingOfTracks();
		RailwayStationRule.KeepTheStationClean();
		RailwayStationRule.BeMindfulOfEmergencyExits();
		RailwayStationRule.NoUnauthorizedVendors();
		RailwayStationRule.RespectPublicAndPrivateProperty();
		RailwayStationRule.NoLoudOrDisruptiveBehavior();
		
	    BankRule bankRule=new BankPolicies();
	    BankRule.KnowYourCustomerCompliance();
	    BankRule.AntiMoneyLaunderingCompliance();
	    BankRule.CustomerDataPrivacy();
	    BankRule.FairLendingPractices();
	    BankRule.CapitalAdequacyRequirements();
	    BankRule.RiskManagementFramework();
	    BankRule.FraudDetectionAndPrevention();
	    BankRule.InterestRateTransparency();
	    BankRule.TimelyComplaintResolution();
	    BankRule.CorporateGovernance();
	    BankRule.CybersecurityStandards();
	    BankRule.LiquidityManagement();
	    BankRule.RegulatoryReporting();
	    BankRule.InvestmentInSecureTechnologies();
	    BankRule.ConflictfInterestDisclosure();
	}

	
		
	}


