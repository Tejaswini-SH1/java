class Flower{
	public static void rose(String smell){
		System.out.println("running string in smell with string parameter");
		System.out.println("smell:" +smell);
	}
	public static void rose(String smell,String color){
		System.out.println("running string in rose with string parameter");
		System.out.println("smell:" +smell);
	    System.out.println("color:" +color);
	}
	public static void rose(String smell,String color,double price){
		System.out.println("running string in rose with string parameter");
		System.out.println("smell:" +smell);
	    System.out.println("color:" +color);
		System.out.println("price:" +price);
	}
	public static void jasmin(double quantity){
		System.out.println("running string in jasmin with string parameter");
		System.out.println("quantity:" +quantity);
	}
	public static void jasmin(double quantity,double price){
		System.out.println("running string in jasmin with string parameter");
		System.out.println("quantity:" +quantity);
		System.out.println("price:" +price);
	}
}