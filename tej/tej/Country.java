//Declare country class with Below methods
//1. Method to take states: String[] : 29
//2. Methods to take pincode: int[]: 10
//3. Method to take primeminister:String[]: All
//4. Method to take Cabinet ministers:String[]: 30
//5. Method to take political parties:String[]: 5	



class Country{

public static void primeministersName(String[] ministers){
	
	System.out.println("start main");
	
	for(int start=0;start<ministers.length;start++){
	
	String ref= ministers[start];
	System.out.println("minister name:"+ref);
	}





public static void citynumber(int[] number){
	
	System.out.println("start main");
	
	for(int start=0;start<number.length;start++){
	
	int ref= number[start];
	System.out.println("number"+ref);
	}

	




	public static void states(String[] args){
		System.out.println("starts main country");
		for (int position=0;position<=29;position++){
		String ref=states[position];
		System.out.println("states:"+ref);	
	}
	    System.out.println("ends main country");
    }
	


	
	
	public static void cabnetMinister(String[] args){
	System.out.println("starts main country");
	for(int num=0;position<cabinetminister.length;position++){
		String ref=cabinetMinister[position];
		System.out.println("cabinetMinister:"+ref);	
	}
	System.out.println("ends main country");
}
	


 

public static void politicalpartiesName(String[] parties){
	
	System.out.println("start main");
	
	for(int start=0;start<parties.length;start++){
	
	String ref= parties[start];
	System.out.println("parties name:"+ref);
	}


}

}


























