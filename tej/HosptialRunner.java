class HospitalRunner
{
	public static void main(String[] args)
	{
		System.out.println("running main in HospitalRunner");
		double cost=Hospital.price("Nexvenla");
		System.out.println("cost :"+cost);
		double mCost=Hospital.price("Nexito");
		System.out.println("mCost :"+mCost);
		String mName=Hospital.medicineName("fever");
		System.out.println("mName :"+mName);
		String mmName=Hospital.medicineName("Fatigue");
		System.out.println("mmName :"+mmName);
		char avail=Hospital.availability("DR PPM");
		System.out.println("avail :"+avail);
		char available=Hospital.availability("DR PPK");
		System.out.println("available :"+available);
		
	}
	
}