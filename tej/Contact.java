class Contact
{
	public static String searchContact(long mobileNo)
	{
		System.out.println("Starting searchContact");
		System.out.println("mobileNo :"+mobileNo);
		if (mobileNo==9008491008L) //==is a operator that checks address
		{
			return "Nidhi";
	 	}
		else
		{ 
			return "not found";
		}
		
	}
	public static void main(String[] args)
	{
		System.out.println("Running main in contact");
		String name=searchContact(9008491008L);
		System.out.println("name :"+name);
		name=searchContact(9876543210L);
		System.out.println("NAME :"+name);
		
		
	}
}
