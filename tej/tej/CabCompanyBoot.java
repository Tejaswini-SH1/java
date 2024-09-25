class   CabCompanyBoot
{
	public static void main(String[] args)
	{
		System.out.println("START");
		CabCompany  cabCompany =new   CabCompany();
		
		String name=cabCompany.name;
		double price=cabCompany.price;
		int quantity=cabCompany.quantity;
		
		System.out.println("CabCompany name:"+name);
		System.out.println("CabCompany price:"+price);
		System.out.println("CabCompany quantity:"+quantity);
		
		cabCompany.name="Uber";
		cabCompany.price=100000;
		cabCompany.quantity=4;
		
		System.out.println("Candy Updated name:"+cabCompany.name);
		System.out.println("Candy Updated price:"+cabCompany.price);
		System.out.println("Candy Updated quantity:"+cabCompany.quantity);
		
		System.out.println("END");
	}	
		
		
		
}
