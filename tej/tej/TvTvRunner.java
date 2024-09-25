class TvTvRunner{
	public static void main(String[] args){
		System.out.println("start main in TvTvRunner");
		
		TvTv tvtv=new TvTv();//allocate,copy IV, default values, invoke
//const: special method,return location

        double cost=tvtv.makingCost;
		System.out.println("cost :"+cost);//15000
		cost=15200;
		System.out.println("cost :"+tvtv.makingCost);
		tvtv.makingCost=15200;
		
		int warranty=tvtv.warranty;
		System.out.println("Warranty :"+warranty);//1
		warranty=2;
		System.out.println("Warranty :"+warranty);//2
		
		System.out.println("TvTv Warranty :"+tvtv warranty);//1
		
		
		System.out.println("end main in TvTvRunner");
        
	}
}