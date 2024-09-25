class Taxi{
	String company="ola";
	Driver driver=new Driver("Harish","420",48);
	
	Taxi(){
		System.out.println("Created battery using  no-arg const");
	}
	public void display(){
		System.out.println("Company:"+this.company);
		
		this.driver.display();
		
	}
	
	
	
}