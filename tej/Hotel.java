//Hotel : name:literal, Owner:literal
//Declare a method to print details


class Hotel{
	
	String name="Abhi";
	Owner owner=new Owner("Teja",23,'F');
	
	Hotel(){
		System.out.println("Created a hotel with no parameter const...");
		
	}
	public void create(){
	    Owner.create();
	}
}