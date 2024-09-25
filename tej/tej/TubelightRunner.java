class TubelightRunner
{
	public static void main(String[] values)
	{
		Tubelight tubelight=new Tubelight();
		tubelight.print();
		
		Tubelight tubelight1=new Tubelight();
		tubelight1.setColor("Red");
		tubelight1.print();
		
	
		Biryani biryani=new Biryani(180);
		biryani.setQuantity(1);
		biryani.type="Chicken";
		biryani.display();
		
		Biryani biryani1=new Biryani(250);
		biryani1.setQuantity(2);
		biryani1.type="Mutton";
		biryani1.display();
		
		
		
		
		
	}
 
}