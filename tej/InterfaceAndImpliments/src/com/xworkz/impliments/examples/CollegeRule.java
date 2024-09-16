package com.xworkz.impliments.examples;

public interface CollegeRule {
	
	default boolean Attendance() {
		return false;
	}
	
	String AcademicIntegrity();
	String RespectfulConduct();
	boolean DressCode();
	boolean UseOfElectronicDevices();
	String SubstanceFreeCampus();
	boolean PropertyRespect();
	String ExaminationRules();
	boolean HealthAndSafetyCompliance();
	boolean ClubAndExtracurricularActivities();
	String Punctuality();
	
}
	
	