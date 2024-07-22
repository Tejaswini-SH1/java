class FoodItem
{
	public static void main(String[] args)
	{
		System.out.println("running main in fooditem");
		double price=getPrice("panipuri");
		System.out.println("price :"+price);
		double cost=getPrice("Pizza");
		System.out.println("cost :"+cost);
	}
	public static double getPrice(String item)
	{
		System.out.println("starting getPrice");
		System.out.println("item arg :"+item);
		if(item=="panipuri")
		{
			System.out.println("Item is panipuri");
			return 30;
		}
		else if(item=="dahipuri")
		{
			System.out.println("Item is dahipuri");
			return 65;
		}
		System.out.println("no item matched");
		return 0;
	}
}