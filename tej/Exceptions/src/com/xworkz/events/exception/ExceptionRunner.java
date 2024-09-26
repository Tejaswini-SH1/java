package com.xworkz.events.exception;

import javax.naming.InvalidNameException;

import com.xworkz.events.service.CustomerServiceImpl;

public class ExceptionRunner {

		public static void main(String[] args)throws InvalidNameException, ClassNotFoundException
		{

			
			CustomerServiceImpl customerServiceImpl=new CustomerServiceImpl();
			System.out.println("running before check age");
			customerServiceImpl.checkAge(25); // 0 //unchecked event
			System.out.println("running after check age");
			
			System.out.println("running before name method");
			customerServiceImpl.save("tejavvaa");
			System.out.println("running after name method");
			
			
			System.out.println("before className");
			Class.forName("java.lang.No"); //event:stop
			System.out.println("after forName");


		}


	}


