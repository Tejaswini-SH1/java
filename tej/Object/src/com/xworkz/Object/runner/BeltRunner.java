package com.xworkz.Object.runner;

import com.xworkz.Object.internal.Belt;
import com.xworkz.Object.internal.Dancer;
import com.xworkz.Object.internal.LeatherBelt;

public class BeltRunner {

	public static void main(String[] args) {
		Dancer dancer=new Dancer();
		Belt belt=new Belt();
		dancer.use(belt);
		
		LeatherBelt leatherBelt=new LeatherBelt();
		dancer.use(leatherBelt);
		
	}

}

