//Create instance using each const , need to print all the references after creation of the instance

//Mask : double cost,char size,String material
//No parameter const
//Constructor to init cost
//Constructor to init size
//Constructor to init material
//Constructor to init cost ,size and material
//Constructor to init cost and size

//Kerosene: double price,int quantity,boolean quality
//No Parameter const
//Constructor to init price,quantity and quality
//Constructor to init quality
//Constructor to init price

//Aeroplane: String company,int noOfSeats,double ticketPrice,String source,String destination
//No Parameter const
//Constructor to init all instance variables
//Constructor to init company,source,destination
//Constructor to init company,ticketPrice,source,destination


class Aeroplane
{
	String company;
	int noOfSeats;
	double ticketPrice;
	String source;
	String destination;


	Aeroplane()
	{
		System.out.println("No parameter const");
	}
	Aeroplane(String company,int noOfSeats,double ticketPrice,String source,String destination)
	{
		this.company=company;
		this.noOfSeats=noOfSeats;
		this.ticketPrice=ticketPrice;
		this.source=source;
		this.destination=destination;
	}

	Aeroplane(String company,String source,String destination)
	{
	this.company=company;
	this.source=source;
	this.destination=destination;
	}
	Aeroplane(String company,double ticketPrice,String source,String destination)
	{
		this.company=company;
		this.ticketPrice=ticketPrice;
		this.source=source;
		this.destination=destination;
	}


}
