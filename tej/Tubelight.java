class Tubelight	 
{
	String color;
	double price;
	int watts;
	
	public void print()
	{
		System.out.println("Color:"+this.color);
		System.out.println("Price:"+this.price);
		System.out.println("Watts:"+this.watts);
	}
	public void setColor(String color)
	{
		this.color=color;
		
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public void setWatts(int watts)
	{
		this.watts=watts;
	}
}