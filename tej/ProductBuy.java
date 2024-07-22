class ProductBuy{
	public static void product(string brand,double price){
		System.out.println("brand:" +brand);
		System.out.println("price:" +price);
		if(price>100 && price>=50)
		{
		    System.out.println("valid");
		}
		else
		{
			System.out.println("invalid");
		}
	}
}
//public static void product(String name,int quantity,String quantity,double price)