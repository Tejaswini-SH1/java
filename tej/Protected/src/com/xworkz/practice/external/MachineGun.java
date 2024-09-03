package com.xworkz.practice.external;

import com.xworkz.practice.internal.Weapon;

public class MachineGun extends Weapon{
	@Override
	public void use()
	{
		System.out.println("running use in machinegun");
	}
    public void fire()
	{
		System.out.println("running fire in machinegun");
	}
	public void kill()
	{
		use();
		fire();
	}

}
