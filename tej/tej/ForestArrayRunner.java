//2. Main to take information of a forest: name,area,establishedYear,state

class ForestArrayRunner{

public static void main(String[] personInfo)
{
	
	if(personInfo.length==4){
 String name= personInfo[0];
 String area=personInfo[1];
 String establishedYear=personInfo[2];
 String state=personInfo[3];
 
  System.out.println("Name:"+name);
  System.out.println("area:"+area);
  System.out.println("establishedYear:"+establishedYear);
  System.out.println("state:"+state);

	}else
	{
	System.out.println("atleast 4 items are needed");
	}
 
 
}
}