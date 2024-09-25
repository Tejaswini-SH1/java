//Company : id,name,location: constructor ,SoftwareEnginner:literal
//Declare a method to print details


class CompanyOne{
	int id;
	String name;
	String location;
	
	SoftwareEngineer softwareEngineer=new SoftwareEngineer("cinchi",1,"developer",30000);
	
	CompanyOne(){
		System.out.println("Created with no parameter const...");
		
	}
	public void create(){
	    SoftwareEngineering.create();
	}

}