class  RapidoBoot
{
	public static void main(String[] args)
	{
		System.out.println("START");
		Rapido rapido =new  Rapido();
		
		String name=rapido.name;
		double price=rapido.price;
		int quantity=rapido.quantity;
		
		System.out.println("Rapido name:"+name);
		System.out.println("Rapido price:"+price);
		System.out.println("Rapido quantity:"+quantity);
		
		rapido.name="Athani";
		rapido.price=60000;
		rapido.quantity=2;
		
		System.out.println("Place Updated name:"+rapido.name);
		System.out.println("Place Updated price:"+rapido.price);
		System.out.println("Place Updated quantity:"+rapido.quantity);
		
		System.out.println("END");
	}	
		
		
		
}
