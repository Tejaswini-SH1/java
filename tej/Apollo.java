//1. Declare a class with below method

//a. Method to take medicine information like name,manf date, price,quantity
//accept from main method and pass as arguments

//b.MEthod to take juice information like name,brand,flavour,price,quantity
//.Accept from main method and pass as arguments





class Apollo
{
	public static void medicine(String name , String manf_date, float price , int quantity)
	{
		System.out.println("Running medicine in Apollo");
		System.out.println("Name :"+name);
		System.out.println("manf_date :"+manf_date);
		System.out.println("Price :"+price);
		System.out.println("Quantity :"+quantity);
	}


	public static void juice(String name, String brand, String flavour, float price, int quantity)
	{
		System.out.println("juice name:"+name);
		System.out.println("juice brand:"+brand);
		System.out.println("juice flavour:"+flavour);
		System.out.println("juice price:"+price);
		System.out.println("juice quantity:"+quantity);
		
	}
}

		
