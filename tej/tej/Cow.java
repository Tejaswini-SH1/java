//chaining--.one constr callling another constr

//1)new: copy
//2)chaining: init iv

//two types in chaining
//1)super: const of the parent cls
//2)this: const of the same cls  


public class Kettle{

	private String brand:
	private double cost;
	private int capacity;
	private String material;
	private int warrenty;
	
	
	public Kettle(String brand,doubke cost){
		super();
		this.brand=brand;
		this.cost=cost;
	}
	
	public Kettle(int capacity, String material, int warrenty){
	
	    this.capacity=capacity;
		this.material=material;
		this.warrenty=warrenty;
		
	}
	
	public Kettle(String brand,double cost,int capacity,string material,int warrenty){
	    this(capapcity,material,warrenty);//optional
		this.brand=brand;
		this.cost=cost;
	}
	
	public Kettle(String brand,double cost,int capacity,string material,int warrenty){
	    this.brand=brand;
		this.cost=cost;
        this.capacity=capacity;
		this.material=material;
		this.warrenty=warrenty;
	
	}
	
}