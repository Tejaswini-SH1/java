class JeanRunner{
	public static void main(String[] args){
		
		
		Jean jean=new Jean();
		jean.size=38;
		jean.type="cotton";
		
		System.out.println("jean sizeed :"+jean.size);
		System.out.println("jean type :"+jean.type);
		System.out.println("jean price :"+jean.price);	
		
	    Jean jean1=new Jean();
	    jean1.size=30;
		jean1.type="ton";
		
		System.out.println("jean1 sizeed :"+jean1.size);
		System.out.println("jean1 type :"+jean1.type);
		System.out.println("jean1 price :"+jean1.price);
		
		Jean jean2=new Jean();
        jean2.size=28;
        jean2.type="wide";

        System.out.println("jean2 sizeed :"+jean2.size);
		System.out.println("jean2 type :"+jean2.type);
		System.out.println("jean2 price :"+jean2.price);		
		
		
	}
}