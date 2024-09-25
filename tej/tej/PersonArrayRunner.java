//1. Main to take information of a person: name,email,age,password





class PersonArrayRunner{

public static void main(String[] personInfo)
{
	
	if(personInfo.length==4){
 String name= personInfo[0];
 String email=personInfo[1];
 String age=personInfo[2];
 String password=personInfo[3];
 
  System.out.println("Name:"+name);
  System.out.println("Email:"+email);
  System.out.println("Age:"+age);
  System.out.println("Password:"+password);

	}else
	{
	System.out.println("atleast 4 items are needed");
	}
 
 
}
}