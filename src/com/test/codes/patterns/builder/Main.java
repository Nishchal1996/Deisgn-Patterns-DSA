package com.test.codes.patterns.builder;


public class Main {
	
	public static void main(String[] args) {
		
		 
		Person p1= new Person.PersonBuilder()
				.setPersonAge(23)
				.setPersonFirstName("Nishchal")
				.setPersonLastName("Shrirame")
				.builder();
		System.out.println(p1);
		
	}

}
