//Association and init using Constructor

//Create two instances of Keybunch,Ganavi and Ananya

//Key: weight,brand--> init this using Const
//declare details()
//Keybunch ---> material,Key--->init this using Const
//declare details()


class Key{
	
	double weight;
	String brand;
	
	Key(double weight,String weight){
		System.out.println("created a key wt no parameters");
		this.weight=weight;
		this.brand=brand;
		
	}
	public void details(){
		System.out.println("weight:"+weight);
		System.out.println("brand:"+brand);
	}
	
	
	
}

