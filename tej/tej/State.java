//State: name,language: constructor CapitalCity : literal
//Declare a method to print details

class State{
	String name;
	String language;
	
	CapatalCity capitalcity=new CapitalCity("Bengalore",60000);
	
    State(){
		System.out.println("Created with no parameter const...");
		
	}
	public void create(){
	    CapitalCity.create();
	}
	
}
