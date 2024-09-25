class NailCutter
{
	//implicit constructor- speacial methods
	
	public NailCutter()
	{
	System.out.println("Created NailCutter");
	}
}


class NailCutterBoot
{
	public static void main(String[] args)
	{
	System.out.println("Start main in NailCutterBoot");
		new NailCutter(); //java will allocate the memory whenever we use new keyword and invokes the constructor
		new BlueBook();
	System.out.println("End main in NailCutterBoot");
	}
	
}


class BlueBook
{
	BlueBook()
	{
	System.out.println("running bluebook");
	}
} 


class Alien
{
	public Alien()
	{
	System.out.println("created alien");
	}
}


class AlienBoot
{
	public static void main(String[] args)
	{
	System.out.println("Starting main");
		//String name= "SUHAS";
		//int doorNO= 18;
	    //doorNO=7;
	Alien anything= new Alien();
	Alien aline1=new Alien();  //copy
		//variable dec= instantiation(making a copy in instance  memory)
	Alien aline2=new Alien(); 
	aline2=aline1;
	System.out.println("End main");
		
	}
}




class Train
{
	public Train()
	{
	System.out.println("created Train");
	}
	
}
class TrainBoot
{
	public static void main(String[] args)
	{
	System.out.println("start main");

	Train train= new Train();
			
	Alien alien= new Alien();
    Train alien1= new Train();
	train=alien1;
			
			//allocate the memory
			//invoke the constructor
			//return the location
	System.out.println("end main");
	}
}