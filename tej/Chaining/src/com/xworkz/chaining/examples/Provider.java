package com.xworkz.chaining.examples;

public abstract class Provider {
	private String name;
	private String ceoname;
	
	
	public Provider(String name, String ceoname) {
		super();
		this.name = name;
		this.ceoname = ceoname;
		
	}


	@Override
	public String toString() {
		return "Provider [name=" + name + ", ceoname=" + ceoname + "]";
	}
	
	
	
	public boolean equals(Object obj) {
				System.out.println("running equals in provider");
			if (obj!=null) {
			if(obj instanceof Provider) {
				Provider casted =(Provider)obj;
				if(this.name==casted.name&&this.ceoname.equals(casted.ceoname))
				{
					return true;
				}
			 else {
				System.out.println("obj is null,,cannot compare..");
			}
			}
			return false;			
			}
			return false;
			
	}
	public abstract void service();
		
	}
	
	
