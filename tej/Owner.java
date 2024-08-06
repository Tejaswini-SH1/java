//Owner : name,age,gender : constructor
//Declare a method to print details

class Owner{
	String name;
	int age;
	char gender;
	
	
	Owner(){
		System.out.println("Created a Owner in argument Constructor");
	}
	
	Owner(String name,int age,char gender){
	this.name=name;
	this.age=age;
	this.gender=gender;
	System.out.println("Created a String,int and boolean in Constructor");
	
	}
	
	public void create(){
		System.out.println("print the values");
		String name="Teja";
	    int age=23;
	    char gender='F';
	}
	
	
}