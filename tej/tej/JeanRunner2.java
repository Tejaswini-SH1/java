class JeanRunner2{
	public static void main(String[] args){
		
		
		Jean jean=null;//null is key word
		//it use only wt a non primitive
        //ref is not pointing to any location
		System.out.println("jean:"+jean);//null
		jean=new Jean();//allocate,copy,IV,
		//jean.size=34;//erroe -- nullpointerexception
		System.out.println("jean :"+jean.size);//0
		
		}
}
		