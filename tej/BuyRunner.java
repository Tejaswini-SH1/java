class BuyRunner
{
	public static void main(String[] args)
	{
		System.out.println("finally main method");
		Buy.product("Lee",500);
		Buy.product("mac",-200,"good",4200.9);
		Buy.bookMovieTicket("KALKI" , "inox" , 3 , 250);
		Buy.buyEgg(10 , 8.99);
		Buy.buyShampoo(16 , 8 ,"Dove" , "15th may");
		Buy.buyCake('C' , "normal" , "chocolate" , 328.99 , 1);
		Buy.buyLaptop("HP" , 234 , 98000 , 322 , 99 ,"MAC" , 512 , 8);
		Buy.buySmartWatch("Boat" , 1500 , 8 , 'N' , 5);
	}
	
}