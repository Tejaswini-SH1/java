package com.xworkz.RND.Assignment;

public class Person {
      String name;
	   int age;
	   String email;
	   long mobileno;

	   

	    public Person(String name, int age, String email, long mobileno) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.mobileno = mobileno;
	}



		// Method to display the person details
	    void display() {
	        System.out.println("name:"+name);
	        System.out.println("age"+age);
	        System.out.println("email:"+email);
	        System.out.println("mobileno:"+mobileno);
	    }
	}

