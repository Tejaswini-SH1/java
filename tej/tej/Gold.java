class Gold{
	int carat;
	double cost;
	
	Gold(int caratLocal,double cost costLocal){
		System.out.println("Creating using int,double const");
		System.out.println("Carat:"+carat);
		System.out.println("Cost:"+cost);
		System.out.println("Carat Local:"+caratLocal);
		System.out.println("Cost Local:"+costLocal);
	
	    carat=caratLocal;
		cost=costLocal;
	    System.out.println("Carat updated:"+carat);
	    System.out.println("Cost Updated:"+cost);
}