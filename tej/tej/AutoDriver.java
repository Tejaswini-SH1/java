class AutoDriver
{
	int age; //non-static(instance) variable
	public AutoDriver()
	{
		System.out.println("CREATED AutoDriver");
	}
	
	
}
class AutoDriverBoot
{
	public static void main(String[] args)
	{
		System.out.println("start");
		AutoDriver autoDriver=new AutoDriver();
		int ref=autoDriver.age;
		System.out.println("autoDriver age :"+ref);
		autoDriver.age=40;
		
		int ref1=autoDriver.age;
		System.out.println("AutoDriver age updated :"+ref1);
		System.out.println("end");
	}
	
}

