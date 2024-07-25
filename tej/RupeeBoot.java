class RupeeBoot
{
	public static void main(String[] args)
	{
		System.out.println("START");
		Rupee rupee=new Rupee();
		
		String name=rupee.name;
		double price=rupee.price;
		int quantity=rupee.quantity;
		
		System.out.println("Rupee name:"+name);
		System.out.println("Rupee price:"+price);
		System.out.println("Rupee quantity:"+quantity);
		
		rupee.name="Paisa";
		rupee.price=30;
		rupee.quantity=125;
		
		System.out.println("Matrimony Updated name:"+rupee.name);
		System.out.println("Matrimony Updated price:"+rupee.price);
		System.out.println("Matrimony Updated quantity:"+rupee.quantity);
		
		System.out.println("END");
	}	
		
		
		
}