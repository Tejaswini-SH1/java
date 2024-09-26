package com.xworkz.exception.internal;


public class ServiceCheck {
		public  void save(String invalidEmailException)throws InvalidEmailException
		{
				
		if(invalidEmailException==null|| invalidEmailException.equals("divya@gmail.com"))
		{
			System.out.println("valid email..");
		}
		else {
			System.out.println("invalid email..");
			throw new InvalidEmailException();
		}
		}
		
		
			public  void AcceptPrice(int invalidAmountException)throws InvalidAmountException
			{
					
			if(invalidAmountException>0 && invalidAmountException<=100)
			{
				System.out.println("valid amount..........");
			}
			else {
				System.out.println("invalid amount...");
				throw new InvalidAmountException();
			}
			}
		}


