class RupeeRunner{
	public static void main(String[] args){
		System.out.println("start main");
		Rupee rupee=new Rupee();
		
		double ref=rupee.price;
		String ref=rupee.name;
		int ref=rupee.quantity;
		
		System.out.println("Rupee name :"+name);
		System.out.println("Rupee price :"+price);
		System.out.println("Rupee quantity :"+quantity);

        Matrimony.name="coin";
		Matrimony.price=50;
		Matrimony.quantity="yes";

		System.out.println("Matrimony Updated name :"+Matrimony.name);
		System.out.println("Matrimony updated price :"+Matrimony.price);
		System.out.println("Matrimony Updated quantity :"+matrimony.quantity);
		System.out.println("end main");
		
		
	}
}