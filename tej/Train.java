class Train{
	public static void book(String source,String destination ){
		System.out.println("running string in book with string parameter");
		System.out.println("source:" +source);
	    System.out.println("destination:" +destination);
	}
	public static void book(String source,String destination,String quantity ){
		System.out.println("running string in book with string parameter");
		System.out.println("source:" +source);
	    System.out.println("destination:" +destination);
        System.out.println("quantity:" +quantity);
	}
	public static void book(String source,String destination,String quantity,double price){
		System.out.println("running string in book with string parameter");
		System.out.println("source:" +source);
	    System.out.println("destination:" +destination);
        System.out.println("quantity:" +quantity);
		System.out.println("price:" +price);
	}
	public static void cancel(double ticketNumber){
		System.out.println("running string in cancel with string parameter");
		System.out.println("ticketNumber:" +ticketNumber);
	}
	public static void cancel(String source,String destination){
		System.out.println("running string in cancel with string parameter");
		System.out.println("source:" +destination);
	}
}	
		
		
		
		
		
		
		
		
		
		
		
		
		