//Country : name , continent, State:literal
//Declare a method to print details


class CountryOne{
	String name;
	continent asia;
	
	State state=new State("Karnataka","Kannada");
	
	CountryOne(){
		System.out.println("craeted constrants with no parameter");
	}
	
	public void create(){
		State.create();
	}
}