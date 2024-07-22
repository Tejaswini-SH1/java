class VisitingCardRunner{
	public static void main(String[] args){
		System.out.println("running main in VisitingCardRunner");
		if(args.length==4)
		{
			
			String shape=args[0];
			String color=args[1];//into info
			String price=args[2];
			String size=args[3];
			
			//wrapper class
			float covertedprice= Float.parseFloat(price);
			
				VisitingCard.info(shape,color,covertedprice,size);
				//after compilation javac VisitingCardRunner we should write square,black,40,s
	
		}
		else{
			System.out.println("3 ans required");
		}
		
	}
  }