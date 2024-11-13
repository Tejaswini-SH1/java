package com.xworkz.java.service;

public abstract class CricketDTO {
	abstract boolean validateAndSave(CricketDTO dto);

	public String getGroundName() {
		// TODO Auto-generated method stub
		return null;
	}

	protected abstract int getNoOfTickets();

	protected abstract String getCustomerEmail();

}
