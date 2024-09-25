//3. Main to take information of a palace: name,location,builtBy,buildYear



class palaceArrayRunner{

public static void main(String[] personInfo)
{
	
	if(personInfo.length==4){
 String name= personInfo[0];
 String location=personInfo[1];
 String builtBy=personInfo[2];
 String buildYear=personInfo[3];
 
  System.out.println("Name:"+name);
  System.out.println("location:"+location);
  System.out.println("builtBy:"+builtBy);
  System.out.println("buildYear:"+buildYear);

	}else
	{
	System.out.println("atleast 4 items are needed");
	}
 
 
}
}