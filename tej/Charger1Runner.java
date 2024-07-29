class Charger1Runner{
public static void main(String[] args)
{
	Charger1 charger1=new Charger1();
	charger1.price=100;
	charger1.company="samsung";
	
	    System.out.println("charger1 price:"+charger1.price);
	    System.out.println("charger1 company:"+charger1.company);
		System.out.println("charger1 quantity:"+charger1.quantity);
		
		Crow crow=new Crow();
		crow.C_name="nidhi";
		crow.C_color="black";
		
		System.out.println("crow C_name:"+crow.C_name);
		System.out.println("crow C_color:"+crow.C_color);
		System.out.println("crow noof_crow:"+crow.noof_crow);
					
		Clock clock=new Clock();
		clock.price=400;
	    clock.name="toyota";
				
		System.out.println("clock price:"+clock.price);
		System.out.println("clock name:"+clock.name);
		System.out.println("clock quantity:"+clock.quantity);
					
		Lolipop lolipop=new Lolipop();
        lolipop.name="strawbery";
        lolipop.price=5;
	   
	    System.out.println("lolipop name:"+lolipop.name);
	    System.out.println("lolipop price:"+lolipop.price);
	    System.out.println("lolipop quantity:"+lolipop.quantity);

	    Keybord keybord=new Keybord();
	    keybord.name="hp";
	    keybord.price=500;
	   
	    System.out.println("keybord name:"+keybord.name);
	   	System.out.println("keybord price:"+keybord.price);
		System.out.println("keybord quantity:"+keybord.quantity);
			
Mountain mountain1=new Mountain1();
		mountain1.name="kamet";
        mountain1.distance=3787;
		System.out.println("mountain1 name:"+mountain1.name);
	   	System.out.println("mountain1 distance:"+mountain1.distance);
		System.out.println("mountain1 color:"+mountain1.color);
			 
	    Stadium stadium=new Stadium();
        stadium.name="chinnswamy";
        stadium.size=33800;	
        System.out.println("Stadium name:"+stadium.name);
	    System.out.println("Stadium size:"+stadium.size);
	    System.out.println("Stadium city:"+stadium.city);
			
			
	    Spray spray=new Spray();
	    spray.name="sweetheart";
		spray.price=400;
		System.out.println("spray name:"+spray.name);
	    System.out.println("spray price:"+spray.price);
	    System.out.println("spray quantity:"+spray.quantity);
		
					
		
}
}