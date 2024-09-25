class ApolloBoot{
	public static void main(String[] medicines)
	{
		if (medicines.length==5)
		{
			String name =medicines[0];
			String brand =medicines[1];
			String flavour=medicines[2];
			String price =medicines[3];
			String quantity=medicines[4];
			
			float convertedprice = Float.parseFloat(price);
			int convertedquantity=Integer.parseInt(quantity);
			 
			 NailPaint.juice(name,brand,flavour,convertedprice, convertedquantity );
		}
	}
}