class Biryani
{
	String type;//ref
	double price;//const
	int quantity;//setter
	String restaurantName="Chickpete Biryani";
	
	public Biryani(double price)
	{
		this.price=price;
	}
	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}
	public void display()
	{
		System.out.println("restaurantName:"+this.restaurantName);
		System.out.println("price:"+this.price);
		System.out.println("type:"+this.type);
		System.out.println("quantity:"+this.quantity);
	}
	
	
}