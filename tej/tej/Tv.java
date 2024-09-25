class Tv
{
	public static void main(String[] args)
	{
		System.out.println("Tv has main");
		Tv.realityshows(); //INVOKE
		Tv.movies(); //INVOKE
	}
	public static void realityshows()
		{
			System.out.println("Tv has Realityshows");
		}
	public static void movies()
		{
			System.out.println("Realityshows has movies");
		}	
		
}
