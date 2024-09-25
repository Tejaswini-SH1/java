//A.Write a class with below methods
//1.Method to take code and return country: 5 condition


class World
{
	public static String country (int code)
	{
		System.out.println("running code in world");
		System.out.println("code :"+code);
		if(code==212)
		{
			System.out.println("country is Morocco");
			return "Morocco";
		}
		else if(code==420)
		{
			System.out.println("country is Czech Republic");
			return "Czech Republic";
		}
		else if (code== 82)
		{
			System.out.println("country is South Korea");
			return "South Korea";
		}
		else if (code== 971)
		{
			System.out.println("country is UAE");
			return "UAE";
		}
		else{
			System.out.println(0);
			return "country not found";
			
		}
	}
	
	//2.Method to take item and return price: 5 condition
	
	public static double price(String item)
	{
		System.out.println("Running price in World");
		System.out.println("item :"+item);
		if (item=="Biscuit")
		{
			System.out.println("price of biscuit");
			return 50.88;
		}
		else if(item=="Chair")
		{
			System.out.println("price of chair");
			return 585.56;
		}
		else if(item== "Mobile")
		{
			System.out.println("price of Mobile");
			return 30001;
		}
		else if(item== "SmartTV")
		{
			System.out.println("price of SmartTV");
			return 156789.98;
		}
		else{
			System.out.println("item not found");
			return 0;
		}
	}
	//3.Method to take movie name and return produer name:5 condition
	public static String producerName(String movieName)
	{
		System.out.println("Running producerName in World");
		System.out.println("movieName :"+movieName);
		if(movieName== "Char Minar")
		{
			System.out.println("producer of Love Moctail");
			return "Krismi";
		}
		else if(movieName== "My Fault")
		{
			System.out.println("producer of My Fault");
			return "Carolina";
		}
		else if(movieName== "Kirik Party")
		{
			System.out.println("producer of kirik party");
			return "PushkaraM";
		}
		else if(movieName== "Arjun Reddy")
		{
			System.out.println("producer of Arjun Reddy");
			return "Pranay Reddy";
		}
		else{
			System.out.println("Movie not found");
			return "Movie Nahi toh producer kaha";
		}
		
	}
}