//SoftwareEnginner: name,experience,designation,salary : constructor
//Declare a method to print details

class SoftwareEngineer{
	String name;
	int experience;
	String designation;
	double salary;
	
	SoftwareEngineer(){
		System.out.println("Created a Owner with parameter");
	}
	SoftwareEngineer(){
		this.name=name;
		this.experience;
		this.designation;
		this.salary;
		System.out.println("Created a Owner with parameter constructor");		
		
	}
	
	public void create(){
		System.out.println("SoftwareEngineer name:"+name);
		System.out.println("SoftwareEngineer experience:"+experience);
		System.out.println("SoftwareEngineer designation:"+designation);
		System.out.println("SoftwareEngineer salary:"+salary);
	}
	
}