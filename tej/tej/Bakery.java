class Bakery{
	String name="Iyengar";//
	Location location=new Location();
	
	public void display()
	{
		System.out.println("Name:"+name);//Iyengar
		System.out.println("Location Street:"+location.Street);//address of location
		System.out.println("Location pincode:"+location.pincode);
		System.out.println("Location city:"+location.city);
	}
}