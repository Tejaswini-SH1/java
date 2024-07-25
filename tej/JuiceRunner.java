class Juice
{
	String name;
	double price;
	int quantity;
	
	Juice()
	{
		System.out.println("Created Juice");
	}
}class JuiceBoot
{
	public static void main(String[] args)
	{
		System.out.println("START");
		Juice juice=new Juice();
		
		String name=juice.name;
		double price=juice.price;
		int quantity=juice.quantity;
		System.out.println("Juice name :"+name);
		System.out.println("Juice price :"+price);
		System.out.println("Juice quantity :"+quantity);
		juice.name="Orange";
		juice.price=45;
		juice.quantity=250;
		System.out.println("Juice Updated name :"+juice.name);
		System.out.println("Juice updated price :"+juice.price);
		System.out.println("Juice Updated quantity :"+juice.quantity);
		System.out.println("END");
	}
}