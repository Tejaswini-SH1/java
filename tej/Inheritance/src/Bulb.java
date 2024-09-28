public class Bulb {
	
	
	 public int volts;
	
	public Bulb()
	{
		System.out.println("Created a no parm cons.............");
	}
	public Bulb(int volts)
	{
		this.volts=volts;
	}
	public void glow()
	{
		System.out.println("Bulb is glowing");
		System.out.println("Bulb voits:"+volts);
		
	}

}


package com.inheritance.things;

public class Tubelight extends Bulb{
	
	public Tubelight()
	{
		System.out.println("Created a Tubelight with no args const..........");
	}

}