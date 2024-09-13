package com.xworkz.RND.Assignment;

public class personRunner {

	public static void main(String[] args) {




		Person person1 = new Person("Sham", 27,"sham@gmail.com",98645424);
        Person person2 = new Person("ram", 29,"ram@gmail.com",996345654);
        Person person3= new Person("Channu", 22,"channu@gmail.com",98422024);
        Person person4 = new Person("kiran", 25,"kiccha@gmail.com",99876424);
        Person person5= new Person("John", 25,"john@gmail.com",99876424);


        Person[] persons = {person1, person2, person3, person4, person5};


        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }



}


	


