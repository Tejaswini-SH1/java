//B. Write a class with below methods
//1.Method to take medicineName and return price : 3 condition

class Hospital
{
	public static double price(String medicineName)
	{
		System.out.println("Running price in Hospital");
		System.out.println("medicineName :"+medicineName);
		if(medicineName=="Nexvenla")
		{
			System.out.println("Price of Nexvenla");
			return 234.56;
		}
		else if(medicineName=="Dolo")
		{
			System.out.println("price of Dolo");
			return 23.43;
		}
		else if(medicineName=="Azee")
		{
			System.out.println("price of Azee");
			return 146.43;
		}
		else if(medicineName=="RekoolD")
		{
			System.out.println("price of RekoolD");
			return 109.99;
		}
		else
		{
			System.out.println("medicine not found");
			return 0;
		}
	}
	//2.Method to take symptom and return medicineName: 3 condition
	public static String medicineName(String Symptom)
	{
		System.out.println("running medicineName in Hospital");
		System.out.println("Symptom :"+Symptom);
		if(Symptom=="fever")
		{
			System.out.println("medicine for fever");
			return "Dolo";
		}
		else if(Symptom== "Cold")
		{
			System.out.println("medicine for cold");
			return "Okacet";
		}
		else{
			System.out.println("No Symptom");
			return "why medicine when no any symptom";
			
		}
	}
	//3.Method to take doctor name and return availability:3 condition
	public static char availability(String doctorName)
	{
		System.out.println("running availability in Hospital");
		System.out.println("doctorName :"+doctorName);
		if(doctorName=="DR PPM")
		{
			System.out.println("Dr PPM availability");
			return 'Y';
		}
		else if(doctorName=="DR APK")
		{
			System.out.println("Dr Apk availability");
			return 'N';
		}
		else{
			System.out.println("NO DR NAME FOUND");
			return 'Z';
		}
	}
}