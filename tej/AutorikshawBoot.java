class  AutorikshawBoot
{
	public static void main(String[] args)
	{
		System.out.println("START");
		Autorikshaw autorikshaw =new  Autorikshaw();
		
		String name=autorikshaw.name;
		double price=autorikshaw.price;
		int quantity=autorikshaw.quantity;
		
		System.out.println("Autorikshaw name:"+name);
		System.out.println("Autorikshaw price:"+price);
		System.out.println("Autorikshaw quantity:"+quantity);
		
		autorikshaw.name="Autoraja";
		autorikshaw.price=50000;
		autorikshaw.quantity=4;
		
		System.out.println("Fruit Updated name:"+autorikshaw.name);
		System.out.println("Fruit Updated price:"+autorikshaw.price);
		System.out.println("Fruit Updated quantity:"+autorikshaw.quantity);
		
		System.out.println("END");
	}	
		
		
		
}