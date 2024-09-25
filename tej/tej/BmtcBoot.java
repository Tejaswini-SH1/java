class   BmtcBoot
{
	public static void main(String[] args)
	{
		System.out.println("START");
		Bmtc  bmtc =new Bmtc();
		
		String name=bmtc.name;
		double price=bmtc.price;
		int quantity=bmtc.quantity;
		
		System.out.println("Bmtc name:"+name);
		System.out.println("Bmtc price:"+price);
		System.out.println("Bmtc quantity:"+quantity);
		
	    bmtc.name="BangBus";
		bmtc.price=1000000;
		bmtc.quantity=40;
		
		System.out.println("Medicine Updated name:"+bmtc.name);
		System.out.println("Medicine Updated price:"+bmtc.price);
		System.out.println("Medicine Updated quantity:"+bmtc.quantity);
		
		System.out.println("END");
	}	
		
		
		
}