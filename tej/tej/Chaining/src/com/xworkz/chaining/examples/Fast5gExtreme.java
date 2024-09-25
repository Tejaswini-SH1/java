package com.xworkz.chaining.examples;

public class Fast5gExtreme extends InternetProvider {

	public Fast5gExtreme(int i, String name, String ceoname, String string) {
		super(name, ceoname);
	}
	@Override
	public void service() {
			System.out.println("running service in InternetProvider");
			
		}
	}


