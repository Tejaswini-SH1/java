//Init properties using 4 different ways
//Declare a method to print all instance variables
//Create least 3 copies


//Speaker : brand,size,cost,output
//Rocket: country,speed,fuelCapacity,noOfThrusters
//Chocolate: brand,price,flavour,size
//Projector: company,type,color,weight
//Paper : thickness,size,quality,color

class Speaker
{
	String brand;
	int size;
	double cost;
	String output="post-amplification";

	public void display()
	{
		System.out.println("Brand name:"+brand);
		System.out.println("Speaker size:"+size);
		System.out.println("Speaker cost:"+cost);
		System.out.println("Speaker output:"+output);
	}



	public Speaker(int size)
	{
		this.size=size;
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
	}



}