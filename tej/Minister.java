class Minister
{
	public static void serve()
	{
		System.out.println("serve");
		 Assistant.help();
		
		 
	}
}
class Assistant
{
	public static void help()
	{
		System.out.println("help");
		Driver.drive();
	}
}
class Driver
{
	public static void drive()
	{
		System.out.println("drive");
		Vehicle.transport();
	}
}
class Vehicle
{
	public static void transport()
	{
		System.out.println("transport");
		MusicSystem.play();
	}
}
class MusicSystem
{
	public static void play()
	{
		System.out.println("play");
		Application.run();
	}
}
class Application 
{
	public static void run()
	{
		System.out.println("run");
		Internet.stream();
	}
}
class Internet
{
	public static void stream()
	{
		System.out.println("stream");
		Server.connect();
	}
}
class Server{
	public static void connect()
	{
		System.out.println("connect");
		Location.display();
	}
}
class Location
{
	public static void display()
	{
		System.out.println("display");
		Building.openGate();
	}
}
class Building
{
	public static void openGate()
	{
		System.out.println("openGate");
		Metal.strength();
	}
}
class Metal
{
	public static void strength()
	{
		System.out.println("strength");
		Factory.make();
	}
}
class Factory 
{
	public static void make()
	{
		System.out.println("make");
		Machine.design();
	}
}
class Machine
{
	public static void design()
	{
		System.out.println("design");
		Engineer.nothing();
	}
}
class Engineer
{
	public static void nothing()
	{
		System.out.println("nothing");
	}
}