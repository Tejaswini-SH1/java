1. Explain method with return as the last statement with return type
2.Explain method without return as the last statement with return type
3. Use return with void type

class RetureType
{

public static String name(String usn){
		
		System.out.println("running name in usn");
	
	if(usn=="2ag20cs082")
	{
		return "Tejaswini" ;
	}
	 if(usn=="2ag20cs453")
	{
		return "rekha";
	}
	return "saru";
}

public static String vote(int age){
		
		System.out.println("running name in usn");
	
	if(age>=20)
	{
		return "number" ;
	}
	else
	{
		return "no";
	}
}


public static void access(String name){
	
	System.out.println("run");
	return ;
}

public static void main(String[] args){
	name("2ag20cs062");
	vote(26);
	access("saru");
}


}