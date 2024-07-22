class ApolloRunner{
	public static void main(String[] medicines){ 
	if(medicines.length==4)
		{
			
			String name =medicines[0];
			String manfdate=medicines[1];
			String price=medicines[2];
			String quantity=medicines[3];
			
			 float convertedprice = Float.parseFloat(price);
			 int convertedquantity=Integer.parseInt(quantity);
			 
			 NailPaint.medicine(name,manfdate,convertedprice,convertedquantity );
			 
			 
		}
		
		
	}
}
		
		
