class FoodDeliveryCompanyBoot
{
	public static void main(String[] args)
	{
		System.out.println("START");
		FoodDeliveryCompany  foodDeliveryCompany =new FoodDeliveryCompany();
		
		String name=foodDeliveryCompany.name;
		double price=foodDeliveryCompany.price;
		int quantity=foodDeliveryCompany.quantity;
		
		System.out.println("FoodDeliveryCompany name:"+name);
		System.out.println("FoodDeliveryCompanyprice:"+price);
		System.out.println("FoodDeliveryCompany quantity:"+quantity);
		
	    foodDeliveryCompany.name="Swiggy";
		foodDeliveryCompany.price=2000;
		foodDeliveryCompany.quantity=10;
		
		System.out.println("Food Updated name:"+foodDeliveryCompany.name);
		System.out.println("Food Updated price:"+foodDeliveryCompany.price);
		System.out.println("Food Updated quantity:"+foodDeliveryCompany.quantity);
		
		System.out.println("END");
	}	
		
		
		
}