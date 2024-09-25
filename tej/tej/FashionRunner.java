class FashionRunner
{
	public static void main(String[] args)
	{
		System.out.println("FASHION KA HAI YEH JALWA");
		Fashion.clothing("SAREE");
		Fashion.footwear("Wedges" , 7869.7777);
		int noOfProducts=Fashion.noOfProducts();
		System.out.println("noOfProducts :"+noOfProducts);
		String brand=Fashion.brand(); 
		System.out.println("brand :"+brand);
	}
}
