class WorldRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running main");
		String Ccode=World.country (420);
		System.out.println("Ccode :"+Ccode);
		String CCode=World.country (111);
		System.out.println("CCode :"+CCode);
		double itemName=World.price("Mobile");
		System.out.println("itemName :"+itemName);
		double itemmName=World.price("Chair");
		System.out.println("itemmName :"+itemmName);
		String movie= World.producerName("Carolina");
		System.out.println("movie :"+movie);
		String moviez= World.producerName("Pranay Reddy");
		System.out.println("moviez :"+moviez);
	}
}